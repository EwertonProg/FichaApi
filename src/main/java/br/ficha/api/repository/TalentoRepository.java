package br.ficha.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ficha.api.model.Talento;

@Repository
public interface TalentoRepository extends JpaRepository<Talento, Integer>{
	
}
