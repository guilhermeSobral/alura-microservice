package alura.microservice.loja.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class CompraDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<ItensDaCompraDTO> itens;
	private EnderecoDTO endereco;
	
	public CompraDTO(List<ItensDaCompraDTO> itens, EnderecoDTO endereco) {
		this.itens = itens;
		this.endereco = endereco;
	}

	public List<ItensDaCompraDTO> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}
	
	

}
