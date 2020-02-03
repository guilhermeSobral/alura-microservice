package br.com.alura.microservice.fornecedor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.microservice.fornecedor.repository.InfoRepository;

@Configuration
public class MockDataConfig {
	
	@Autowired
	private InfoRepository infoRepository;
	
	@Bean
	public void insertMockData() {
		//InfoFornecedor fornecedor = new InfoFornecedor();
		//fornecedor.setId(null);
		//fornecedor.setNome("Fornecedor SP");
		//fornecedor.setEstado("SP");
		//fornecedor.setEndereco("AV.Paulista");
		
		//infoRepository.save(fornecedor);
	}

}
