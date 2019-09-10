package br.com.crud.tiaguinho.mapeamento;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pessoa {
	
	 @Id
	 long id;
     private String nome; 
     private String dataNascimento;
     private String telefone;
     
	public Pessoa(long id, String nome, String dataNascimento, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}
     
     
     
}
