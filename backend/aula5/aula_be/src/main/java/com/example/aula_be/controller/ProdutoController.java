package com.example.aula_be.controller;

import java.util.List;

import com.example.aula_be.model.Produto;
import com.example.aula_be.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService servico;

    @GetMapping
    public List<Produto> obterProdutos() {
        return servico.obterTodos();
    }

    @PostMapping
    public Produto criaProduto(@RequestBody Produto produto) {
        return servico.criarProduto(produto);
    }

    @GetMapping("/contagem")
    public long contagemProdutos() {
        return servico.contagem();
    }

    @GetMapping(value="/{codigo}")
    public List<Produto> encontrarPorCodigo(@PathVariable int codigo) {
        return servico.encontrarPorCodigo(codigo);
    }

    @GetMapping("/desafio")
    public List<Produto> consultaDesafio() {
        return servico.consultaDesafio();
    }

}
