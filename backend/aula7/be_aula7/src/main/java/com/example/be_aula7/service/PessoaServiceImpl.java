package com.example.be_aula7.service;

import java.util.List;
import java.util.Optional;

import com.example.be_aula7.model.Pessoa;
import com.example.be_aula7.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repositorio;

    @Override
    public Pessoa criarPessoa(Pessoa pessoa) {
        // TODO Auto-generated method stub
        return repositorio.save(pessoa);
    }

    @Override
    public List<Pessoa> obterTodos() {
        // TODO Auto-generated method stub
        return repositorio.findAll();
    }

    @Override
    public Pessoa obterPorId(String id) {
        // TODO Auto-generated method stub
        return repositorio.findById(id).get();
    }

    @Override
    public void removerPessoa(String id) {
        // TODO Auto-generated method stub
        repositorio.deleteById(id);
    }

    @Override
    public Pessoa atualizarPessoa(String id, Pessoa pessoa) {
        // TODO Auto-generated method stub
        pessoa.setId(id);
        return repositorio.save(pessoa);
    }
}
