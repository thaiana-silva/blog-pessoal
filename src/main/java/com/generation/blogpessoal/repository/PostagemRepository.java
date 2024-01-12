package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;


//JPA dá poder a repository para comunicar-se com o banco de dados
@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {
	List<Postagem> findAllByTittuloContainIgnoreCase(@Param("titulo") String titulo);
}
