package com.lojagames.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

}
