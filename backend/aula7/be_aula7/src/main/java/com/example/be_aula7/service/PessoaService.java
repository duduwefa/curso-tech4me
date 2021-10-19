package com.example.be_aula7.service;
import com.example.be_aula7.compartilhado.PessoaDto;
import com.example.be_aula7.model.Pessoa;
import java.util.List;
import java.util.Optional;

public interface PessoaService {
    PessoaDto criarPessoa(PessoaDto pessoaDto);
    List<PessoaDto> obterTodos();
    Optional<PessoaDto> obterPorId(String id);
    void removerPessoa(String id);
    PessoaDto atualizarPessoa(String id, PessoaDto pessoaDto);

    Optional<Pessoa> obterPorIdComOptional(String id);
}
