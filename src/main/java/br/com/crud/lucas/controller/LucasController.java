package br.com.crud.lucas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.crud.lucas.mapeamento.Pessoa;
import br.com.crud.lucas.repository.EventoRepository;

@Controller
public class LucasController {
    
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/CadastrarEventos", method=RequestMethod.GET)
	public String form() {
		return "Evento";
	}
	
	@RequestMapping(value="/CadastrarEventos", method=RequestMethod.POST)
	public String form(Pessoa evento) {
		
		er.save(evento);
		
		return "redirect:/CadastrarEventos";
	}
	
}

