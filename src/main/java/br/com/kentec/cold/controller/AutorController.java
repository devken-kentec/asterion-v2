package br.com.kentec.cold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.cold.domain.Autor;
import br.com.kentec.cold.service.AutorService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/cold/api/autor/v1")
public class AutorController {
	
	@Autowired
	private AutorService as;
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrar(@RequestBody Autor autor) {
		as.cadastrar(autor);
	}
	
	@GetMapping("/listarTodosAutor")
	public ResponseEntity<List<Autor>> listarTodos(){
		return ResponseEntity.ok(as.listarTodos());
	}
	
}
