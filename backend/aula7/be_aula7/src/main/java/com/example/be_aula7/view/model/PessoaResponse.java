package com.example.be_aula7.view.model;

public class PessoaResponse {
    private String id;
    private String nome;
    private String sobrenome;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return String.format("%s %s", nome, sobrenome);
    }
    
}
