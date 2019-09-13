package br.com.crud.lucas.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.lucas.mapeamento.Pessoa;

@Repository
public interface EventoRepository extends CrudRepository<Pessoa, Long>{

}
