package br.com.kentec.asterion.controller;

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

import br.com.kentec.asterion.domain.Periodo;
import br.com.kentec.asterion.service.PeriodoService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/periodo")
public class PeriodoController {
	
	@Autowired
	private PeriodoService ps;
	
	@GetMapping("/periodoVigente")
	public ResponseEntity<Iterable<Periodo>> periodoVigente(){
		return ResponseEntity.ok(ps.periodoVigente());
	}
	
	
	@GetMapping("/todosPeriodo")
	public ResponseEntity<Iterable<Periodo>> listarTodos(){
		return ResponseEntity.ok(ps.todosPeriodos());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvarPeriodo(@RequestBody Periodo periodo) {
		ps.salvarPeriodo(periodo);
	}

}
