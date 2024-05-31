package com.marcelo.sgci.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@Size(max = 50)
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Size(max = 8)
	@Column(name = "CEP")
	private String cep;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "ESTADO")
	private String estado;
	
	@NotNull
	@Size(max = 70)
	@Column(name = "CIDADE")
	private String cidade;

	@Size(max = 70)
	@Column(name = "RUA")
	private String rua;
	
	@Column(name = "NUMERO")
	private Integer numero;

	
}
