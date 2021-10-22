package br.com.tech4me.pessoasms.service;
import java.util.List;
import java.util.Optional;

import br.com.tech4me.pessoasms.compartilhado.PessoaDto;
import br.com.tech4me.pessoasms.model.Pessoa;

public interface PessoaService {
    PessoaDto criarPessoa(PessoaDto pessoaDto);
    List<PessoaDto> obterTodos();
    Optional<PessoaDto> obterPorId(String id);
    void removerPessoa(String id);
    PessoaDto atualizarPessoa(String id, PessoaDto pessoaDto);

    Optional<Pessoa> obterPorIdComOptional(String id);
}
