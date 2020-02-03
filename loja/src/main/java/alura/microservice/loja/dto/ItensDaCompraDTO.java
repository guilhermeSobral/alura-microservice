package alura.microservice.loja.dto;

import java.io.Serializable;

public class ItensDaCompraDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer quantidade;
	
	public ItensDaCompraDTO(Integer id, Integer quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
}
