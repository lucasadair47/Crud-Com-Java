package com.mapeamento;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@RestController
@RequestMapping(value="/PESSOAS")
public class Pessoa {
	
	 @Id
	 long id;
     private String nome; 
     private String dataNascimento;
     private String telefone;
     
     
     
}
