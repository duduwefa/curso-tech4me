package com.example.be_aula8.view.model;

import java.util.Date;
import java.util.List;

public class ErrorMessage {

    private Date date;
    private List<String> erros;

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<String> getErros() {
        return erros;
    }
    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public ErrorMessage(Date date, List<String> erros) {
        this.date = date;
        this.erros = erros;
    }
    
} 
