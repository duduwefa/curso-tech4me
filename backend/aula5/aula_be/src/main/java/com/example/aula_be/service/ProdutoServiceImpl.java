package com.example.aula_be.service;

import java.util.List;

import com.example.aula_be.model.Produto;
import com.example.aula_be.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    
    @Autowired
    private ProdutoRepository repositorio;

    @Override
    public Produto criarProduto(Produto produto) {
        // TODO Auto-generated method stub
        return repositorio.save(produto);
    }

    @Override
    public List<Produto> obterTodos() {
        // TODO Auto-generated method stub
        return repositorio.findAll();
    }

    @Override
    public long contagem() {
        // TODO Auto-generated method stub
        return repositorio.count();
    }

    @Override
    public List<Produto> encontrarPorCodigo(int codigo) {
        // TODO Auto-generated method stub
        return repositorio.encontrarPorCodigo(codigo);
    }

    @Override
    public List<Produto> consultaDesafio() {
        // TODO Auto-generated method stub
        return repositorio.consultaDesafio();
    }


}
