package br.ficha.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ficha.api.model.Talento;
import br.ficha.api.repository.TalentoRepository;

@Service
public class TalentoService {
	private final TalentoRepository talentoRepository;
	
	@Autowired
	public TalentoService(TalentoRepository talentoRepository) {
		this.talentoRepository = talentoRepository;
	}

	public Talento salvar(Talento talento) {
		return talentoRepository.save(talento);
	}
	
	public List<Talento> retornarTodos(){
		return talentoRepository.findAll();
	}
}
