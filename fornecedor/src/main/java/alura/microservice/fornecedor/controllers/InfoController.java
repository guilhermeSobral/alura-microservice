package alura.microservice.fornecedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alura.microservice.fornecedor.domain.InfoFornecedor;
import alura.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}

}
