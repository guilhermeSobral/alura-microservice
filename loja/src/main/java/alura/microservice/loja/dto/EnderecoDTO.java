package alura.microservice.loja.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String rua;
	private Integer numero;
	private String estado;
	
	public EnderecoDTO(String rua, Integer numero, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getEstado() {
		return estado;
	}
}
