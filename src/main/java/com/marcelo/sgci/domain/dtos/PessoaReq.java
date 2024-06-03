package com.marcelo.sgci.domain.dtos;

import com.marcelo.sgci.domain.models.EstadoCivilEnum;
import com.marcelo.sgci.domain.models.TipoPessoaEnum;

import jakarta.validation.constraints.NotNull;

public record PessoaReq(
		@NotNull
		String nome,
		
		@NotNull
		EnderecoReq endereco,
		
		@NotNull
		TipoPessoaEnum tipo,
		
		@NotNull
		String documento,
		
		@NotNull
		String profissao,
		
		@NotNull
		EstadoCivilEnum estadocivil
		) {
	
}
