package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;
//controller vai controlar quem vai acessar a rota, quais e como os métodos vão responder ao front/insomnia
@RestController
@RequestMapping("/postagens") // endereço para acessar essa controller
@CrossOrigin(origins = "*", allowedHeaders="*")//informa toda e qualquer origem pode acessar essa rota
public class PostagemController {

	//Injeção de Dependência
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		//respostas no formato http
		
		return ResponseEntity.ok(postagemRepository.findAll()) ;
		//find all == SELECT * from
		
	}
}
