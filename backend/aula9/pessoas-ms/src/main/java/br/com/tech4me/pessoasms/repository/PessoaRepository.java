package br.com.tech4me.pessoasms.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.pessoasms.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
    
}
