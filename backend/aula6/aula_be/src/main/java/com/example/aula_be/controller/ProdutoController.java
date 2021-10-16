package com.example.aula_be.controller;

import java.util.List;

import com.example.aula_be.model.Produto;
import com.example.aula_be.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService servico;

    /* @GetMapping
    public List<Produto> obterProdutos() {
        return servico.obterTodos();
    } */

    @GetMapping
    public ResponseEntity<List<Produto>> obterProdutos() {
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
    }

    /* @PostMapping
    public Produto criaProduto(@RequestBody Produto produto) {
        return servico.criarProduto(produto);
    } */

    @PostMapping
    public ResponseEntity<Produto> criaProduto(@RequestBody Produto produto) {
        return new ResponseEntity<>(servico.criarProduto(produto), HttpStatus.CREATED);
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

    /* @GetMapping(value="/encontrarporid/{id}")
    public Produto obterPorId(@PathVariable String id) {
        return servico.obterPorId(id);
    } */

    @GetMapping(value="/encontrarporid/{id}")
    public ResponseEntity<Produto> obterPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterPorId(id), HttpStatus.FOUND);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<String> removerProduto(@PathVariable String id) {
        servico.removerProduto(id);
        return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public Produto atualizarPorId(@PathVariable String id, @RequestBody Produto produto) {
        return servico.atualizarProduto(id, produto);
    }

}
