package com.example.pessoasms.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.pessoasms.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
    
}
