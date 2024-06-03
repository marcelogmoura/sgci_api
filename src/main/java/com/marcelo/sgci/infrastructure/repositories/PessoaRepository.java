package com.marcelo.sgci.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.sgci.domain.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	


}
