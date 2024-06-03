package com.marcelo.sgci.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.sgci.domain.dtos.PessoaReq;
import com.marcelo.sgci.domain.models.Pessoa;
import com.marcelo.sgci.domain.services.PessoaServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaServiceImpl pessoaServiceImpl;
	
	
	@PostMapping()
	public ResponseEntity<Long> createPessoa(@Valid @RequestBody PessoaReq req) {
		Pessoa pessoa = pessoaServiceImpl.createPessoa(req);
		return ResponseEntity.ok(pessoa.getId());		
	}
	
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("get all pessoas");
	}
	
	@PutMapping
	public String put() {
		return null;
	}
	
    @DeleteMapping("{idPessoa}")
	public ResponseEntity<Long> deletePessoa(@PathVariable Long idPessoa ) {
		Pessoa pessoa = pessoaServiceImpl.deletePessoa(idPessoa);
		return ResponseEntity.ok().build();		
	}
	
}



