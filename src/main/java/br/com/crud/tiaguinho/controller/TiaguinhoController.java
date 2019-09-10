package br.com.crud.tiaguinho.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/tiaguinhos")
public class TiaguinhoController {

	@RequestMapping("/")
	public String index() {
		return "Teste";
	}
}
