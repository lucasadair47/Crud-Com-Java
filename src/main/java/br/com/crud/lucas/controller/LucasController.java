package br.com.crud.lucas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.lucas.mapeamento.Pessoa;
import br.com.crud.lucas.repository.EventoRepository;

@RestController
@Transactional
public class LucasController {
    
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Pessoa evento) {
		return "Teste";
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.GET)
	public Pessoa salvar(Pessoa evento) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(1);
		pessoa.setNome("Lucas");
		pessoa.setDataNascimento("03/10/1997");
		pessoa.setTelefone("99985842");
	
		Pessoa obj = er.save(pessoa);
		return obj;
	}
	
	@RequestMapping(value="/atualizar", method=RequestMethod.POST)
	public String Atualizar(Pessoa evento) {
	    return null;
	}
	
	@RequestMapping(value="/consultar", method=RequestMethod.POST)
	public String Consultar(Pessoa evento) {
	    return null;
	}
	
	@RequestMapping(value="/excluir", method=RequestMethod.POST)
	public String Excluir(Pessoa evento) {
	    return null;
	}
	
}

