package br.com.kentec.asterion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.asterion.domain.Carteira;
import br.com.kentec.asterion.service.CarteiraService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/carteira")
public class CarteiraController {
	
	@Autowired
	private CarteiraService cs;
	
	@GetMapping()
	public ResponseEntity<Iterable<Carteira>> comboCarteira(){
		return ResponseEntity.ok(cs.mostrarTodos());
	}
}
