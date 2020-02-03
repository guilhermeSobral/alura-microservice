package alura.microservice.loja.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoFornecedorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String endereco;
	
	@JsonCreator
	public InfoFornecedorDTO(@JsonProperty("endereco") String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
}
