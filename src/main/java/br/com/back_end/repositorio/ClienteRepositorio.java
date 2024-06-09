package br.com.back_end.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.back_end.model.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository <Cliente, Long>{
    
}
