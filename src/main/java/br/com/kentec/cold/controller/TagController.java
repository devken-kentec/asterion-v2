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

import br.com.kentec.cold.domain.Tag;
import br.com.kentec.cold.service.TagService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/cold/api/tag/v1")
public class TagController {
	
	@Autowired
	private TagService ts;
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrar(@RequestBody Tag tag) {
		ts.cadastrar(tag);
	}
	
	@GetMapping("/listarTodasTag")
	public ResponseEntity<List<Tag>> listarTodos(){
		return ResponseEntity.ok(ts.listarTodos());
	}
}
