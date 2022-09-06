package org.generation.gameStore.repository;

import java.util.List;

import org.generation.gameStore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);
}
