package br.com.crud.lucas.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import br.com.crud.lucas.mapeamento.Pessoa;

@Bean
public interface EventoRepository extends CrudRepository<Pessoa, String>{

}
