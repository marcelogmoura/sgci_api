package com.marcelo.sgci.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.marcelo.sgci.domain.dtos.PessoaReq;
import com.marcelo.sgci.domain.models.Endereco;
import com.marcelo.sgci.domain.models.Pessoa;
import com.marcelo.sgci.infrastructure.repositories.PessoaRepository;

import jakarta.transaction.Transactional;

@Service
@Validated
public class PessoaServiceImpl {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Transactional
	public Pessoa createPessoa( PessoaReq req) {
				
		Endereco endereco = new Endereco(
				req.endereco().cep(), 
				req.endereco().estado(), 
				req.endereco().cidade(), 
				req.endereco().rua(), 
				req.endereco().bairro(), 
				req.endereco().numero());
		
		Pessoa pessoa = new Pessoa(
				endereco, 
				req.nome(), 
				req.tipo(), 
				req.documento(), 
				req.profissao(), 
				req.estadocivil());	
		
		return pessoaRepository.save(pessoa);
		
	}

	@Transactional
	public Pessoa deletePessoa(Long idPessoa) {
		Pessoa pessoa = pessoaRepository.findById(idPessoa).orElseThrow();
		pessoaRepository.delete(pessoa);
		return null;
	}
	





}




