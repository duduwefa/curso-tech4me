package com.example.be_aula7.view.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.be_aula7.model.Pessoa;
import com.example.be_aula7.service.PessoaService;

import org.apache.catalina.connector.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    
    @Autowired
    private PessoaService servico;

    
    @GetMapping
    public ResponseEntity<List<Pessoa>> obterTodos() {
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(servico.criarPessoa(pessoa), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Pessoa> obterPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterPorId(id), HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public Pessoa atualizarPessoa(@PathVariable String id, @RequestBody Pessoa novaPessoa) {
        return servico.atualizarPessoa(id, novaPessoa);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<String> removerPessoa(@PathVariable String id) {
        servico.removerPessoa(id);
        return new ResponseEntity<String>("Removido com sucesso!", HttpStatus.OK);
    }

    //-------------------

    @GetMapping(value="/optional/{id}")
    public ResponseEntity<Pessoa> obterPorIdComOptional(@PathVariable String id) {
        Optional<Pessoa> pessoa = servico.obterPorIdComOptional(id);

        if(pessoa.isPresent()) {
            return new ResponseEntity<>(pessoa.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);        
    }

}
