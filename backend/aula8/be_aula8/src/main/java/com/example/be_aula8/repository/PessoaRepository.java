package com.example.be_aula8.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.be_aula8.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
    
}
