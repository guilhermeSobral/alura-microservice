package alura.microservice.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import alura.microservice.loja.dto.CompraDTO;
import alura.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate client;

	public void realizaCompra(CompraDTO dto) {		
		
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				"http://fornecedor/info/" + dto.getEndereco().getEstado(), 
				HttpMethod.GET,
				null,
				InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}
	
	

}
