package br.com.kentec.asterion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
