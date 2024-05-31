package com.marcelo.sgci.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	private Long id;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "DOCUMENTO" , unique = true)
	private String documento;
		
	@NotNull
	@Size(max = 255)
	@Column(name = "TX_PROFISSAO")
	private String profissao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "EN_TIPO")
	private TipoPessoaEnum tipo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "EN_ESTADO_CIVIL")
	private EstadoCivilEnum estadoCivil;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;

}




