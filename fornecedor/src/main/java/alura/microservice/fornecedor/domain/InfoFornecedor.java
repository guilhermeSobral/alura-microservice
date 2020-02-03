package alura.microservice.fornecedor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfoFornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String endereco;
	
	private String estado;	

	public InfoFornecedor() {
		
	}

	public InfoFornecedor(String nome, String endereco, String estado) {
		this.id = null;
		this.nome = nome;
		this.endereco = endereco;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEstado() {
		return estado;
	}	
}
