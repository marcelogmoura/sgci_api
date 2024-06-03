package com.marcelo.sgci.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENDERECO")
	private Long id;

	@Size(max = 8)
	@Column(name = "CEP")
	private String cep;

	@NotNull
	@Size(max = 255)
	@Column(name = "ESTADO")
	private String estado;

	@NotNull
	@Size(max = 255)
	@Column(name = "CIDADE")
	private String cidade;

	@Size(max = 255)
	@Column(name = "RUA")
	private String rua;

	@Size(max = 50)
	@Column(name = "BAIRRO")
	private String bairro;

	@Column(name = "NUMERO")
	private Integer numero;

	public Endereco() {}
	
	public Endereco(
			@Size(max = 8) String cep, 
			@Size(max = 255) String estado, 
			@Size(max = 255) String cidade,
			@Size(max = 255) String rua, 
			@Size(max = 50) String bairro, 
			Integer numero) {
		super();
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	
	
}
