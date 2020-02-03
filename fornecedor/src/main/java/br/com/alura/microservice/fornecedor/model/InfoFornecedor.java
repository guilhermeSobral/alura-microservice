package br.com.alura.microservice.fornecedor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfoFornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String estado;
	
	private String endereco;	
	
	@Deprecated
	public InfoFornecedor() {
		
	}

	public InfoFornecedor(String nome, String estado, String endereco) {
		this.id = null;
		this.nome = nome;
		this.estado = estado;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEstado() {
		return estado;
	}

	public String getEndereco() {
		return endereco;
	}	
}
