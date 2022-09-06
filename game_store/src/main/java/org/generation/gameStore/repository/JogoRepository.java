package org.generation.gameStore.repository;

import java.util.List;

import org.generation.gameStore.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo,Long>{
	public List<Jogo>findAllByNomeContainingIgnoreCase(String nome);
}
