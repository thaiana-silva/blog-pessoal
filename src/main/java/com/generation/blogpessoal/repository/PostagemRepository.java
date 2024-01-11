package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;
//JPA dá poder a repository para comunicar-se com o banco de dados
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}
