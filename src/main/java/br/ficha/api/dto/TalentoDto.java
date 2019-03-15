package br.ficha.api.dto;

import br.ficha.api.model.Talento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TalentoDto {
	private String nome;
	private String beneficio;
	private String preRequisito;
	
	public Talento criarTalento() {
		return new Talento(nome,beneficio,preRequisito);
	}
}
