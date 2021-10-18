package com.example.be_aula7.service;
import com.example.be_aula7.model.Pessoa;
import java.util.List;
import java.util.Optional;

public interface PessoaService {
    Pessoa criarPessoa(Pessoa pessoa);
    List<Pessoa> obterTodos();
    Pessoa obterPorId(String id);
    void removerPessoa(String id);
    Pessoa atualizarPessoa(String id, Pessoa pessoa);

    Optional<Pessoa> obterPorIdComOptional(String id);
}
