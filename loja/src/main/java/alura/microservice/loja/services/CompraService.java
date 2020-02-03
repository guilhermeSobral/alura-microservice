package alura.microservice.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alura.microservice.loja.client.FornecedorClient;
import alura.microservice.loja.dto.CompraDTO;
import alura.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public void realizaCompra(CompraDTO dto) {		
		
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(dto.getEndereco().getEstado());
		System.out.println(info.getEndereco());
	}
	
	

}
