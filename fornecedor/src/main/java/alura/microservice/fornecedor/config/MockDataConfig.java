package alura.microservice.fornecedor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import alura.microservice.fornecedor.domain.InfoFornecedor;
import alura.microservice.fornecedor.repositories.InfoRepository;

@Configuration
public class MockDataConfig {
	
	@Autowired
	private InfoRepository infoRepository;
	
	@Bean
	public void mockData() {
		InfoFornecedor info = new InfoFornecedor("Fornecedor de SP", "AV.Paulista", "SP");
		infoRepository.save(info);
	}

}
