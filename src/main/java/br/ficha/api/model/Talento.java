package br.ficha.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Talento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nome;
	private String beneficio;
	private String preRequisito;
	
	public Talento(String nome, String beneficio, String preRequisito) {
		this.nome = nome;
		this.beneficio = beneficio;
		this.preRequisito = preRequisito;
	}
	
}
