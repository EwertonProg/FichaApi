package br.ficha.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ficha.api.dto.TalentoDto;
import br.ficha.api.model.Talento;
import br.ficha.api.service.TalentoService;

@CrossOrigin
@RequestMapping("/Talento")
@RestController
public class TalentoController {
	public final TalentoService talentoService;

	@Autowired
	public TalentoController(TalentoService talentoService) {
		this.talentoService = talentoService;
	}

	@PostMapping
	public ResponseEntity<Talento> salvar(@RequestBody TalentoDto talentoDto) {
		Talento talento = talentoDto.criarTalento();
		return new ResponseEntity<Talento>(talentoService.salvar(talento), HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Talento> retornarTodos(){
		return talentoService.retornarTodos();
	}

}
