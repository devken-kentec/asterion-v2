package br.com.kentec.cold.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.cold.DTO.PostDTO;
import br.com.kentec.cold.service.PostService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/cold/api/postagem/v1")
public class PostController {
		
	@Autowired
	private PostService ps;
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<PostDTO>> postLeitura(@PathVariable Long id){
		return ResponseEntity.ok(ps.postLeitura(id));
	}
	
	@GetMapping("listarTodos")
	public ResponseEntity<List<PostDTO>> listarTodos(){
		return ResponseEntity.ok(ps.listarTodos());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrar(@RequestBody PostDTO postDTO) {
		ps.save(postDTO);
	}	

}
