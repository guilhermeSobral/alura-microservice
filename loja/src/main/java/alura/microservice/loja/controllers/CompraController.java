package alura.microservice.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alura.microservice.loja.dto.CompraDTO;
import alura.microservice.loja.services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public void realizaCompra(@RequestBody CompraDTO dto) {
		compraService.realizaCompra(dto);
	}

}
