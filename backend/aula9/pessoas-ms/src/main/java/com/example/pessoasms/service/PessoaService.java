package com.example.pessoasms.service;
import com.example.pessoasms.compartilhado.PessoaDto;
import com.example.pessoasms.model.Pessoa;
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
