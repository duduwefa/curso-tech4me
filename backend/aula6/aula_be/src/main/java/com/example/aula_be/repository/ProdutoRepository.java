package com.example.aula_be.repository;

import java.util.List;

import com.example.aula_be.model.Produto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProdutoRepository extends MongoRepository<Produto,String> {

    @Query("{'codigo': ?0 }")
    List<Produto> encontrarPorCodigo(int codigo);

    @Query("{'nome': /bateria/, 'valor': {$gt: 200.00} }")
    List<Produto> consultaDesafio();
    
}
