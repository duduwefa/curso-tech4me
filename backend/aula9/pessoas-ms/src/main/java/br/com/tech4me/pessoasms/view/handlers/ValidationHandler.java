package br.com.tech4me.pessoasms.view.handlers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.tech4me.pessoasms.view.model.ErrorMessage;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {
    
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        
        /* List<FieldError> erros = 
        ex.
        getBindingResult().
        getFieldErrors();

        List<String> lista = new ArrayList<>();

        for (FieldError fe : erros) {
            lista.add(fe.getDefaultMessage());
        } */

        List<String> erros = 
        ex.
        getBindingResult().
        getFieldErrors().
        stream().
        map(e -> e.getDefaultMessage()).
        collect(Collectors.toList());

        return new ResponseEntity<Object>(new ErrorMessage(new Date(), erros), HttpStatus.NOT_ACCEPTABLE);

    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

        return new ResponseEntity<Object>("O valor da URI tem que ser igual ao do Path Variable", HttpStatus.NOT_ACCEPTABLE);
    }

}
