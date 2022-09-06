package org.generation.gameStore.repository;

import java.util.List;

import org.generation.gameStore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria>findAllByEstiloContainingIgnoreCase(String estilo);
	public List<Categoria>findAllByGeneroContainingIgnoreCase(String genero);
}
