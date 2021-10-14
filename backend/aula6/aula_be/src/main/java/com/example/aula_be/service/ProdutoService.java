package com.example.aula_be.service;

import java.util.List;

import com.example.aula_be.model.Produto;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    List<Produto> obterTodos();
    long contagem();
    List<Produto> encontrarPorCodigo(int codigo);
    List<Produto> consultaDesafio();
    Produto obterPorId(String id);
    void removerProduto(String id);
    Produto atualizarProduto(String id, Produto produto);
}
