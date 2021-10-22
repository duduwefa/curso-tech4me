package br.com.tech4me.pessoasms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.pessoasms.compartilhado.PessoaDto;
import br.com.tech4me.pessoasms.model.Pessoa;
import br.com.tech4me.pessoasms.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repositorio;

    ModelMapper mapper = new ModelMapper();

    @Override
    public PessoaDto criarPessoa(PessoaDto pessoaDto) {
        Pessoa pessoa = mapper.map(pessoaDto, Pessoa.class);
        pessoa = repositorio.save(pessoa);
        PessoaDto dto = mapper.map(pessoa, PessoaDto.class);

        return dto;
    }

    @Override
    public List<PessoaDto> obterTodos() {
        List<Pessoa> pessoas = repositorio.findAll();
        List<PessoaDto> pessoaDto = 
        pessoas.
        stream().
        map(p -> mapper.map(p, PessoaDto.class)).
        collect(Collectors.toList());

        return pessoaDto;
    }

    @Override
    public Optional<PessoaDto> obterPorId(String id) {
        Optional<Pessoa> pessoa = repositorio.findById(id);

        if(pessoa.isPresent()) {
            PessoaDto pessoaDto = mapper.map(pessoa.get(), PessoaDto.class);
            return Optional.of(pessoaDto);
        }

        return Optional.empty();
    }

    @Override
    public void removerPessoa(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public PessoaDto atualizarPessoa(String id, PessoaDto pessoaDto) {
        Pessoa pessoa = mapper.map(pessoaDto, Pessoa.class);
        
        pessoa.setId(id);
        pessoa = repositorio.save(pessoa);

        PessoaDto dto = mapper.map(pessoa, PessoaDto.class);

        return dto;
    }

    @Override
    public Optional<Pessoa> obterPorIdComOptional(String id) {
        return repositorio.findById(id);
    }
}
