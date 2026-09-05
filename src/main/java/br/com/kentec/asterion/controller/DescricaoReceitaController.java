package br.com.kentec.asterion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.asterion.domain.DescricaoReceita;
import br.com.kentec.asterion.service.DescricaoReceitaService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/descricaoReceita")
public class DescricaoReceitaController {
	
	@Autowired
	private DescricaoReceitaService drs;
	
	@GetMapping("/receitaAtiva")
	public ResponseEntity<Iterable<DescricaoReceita>> comboReceita(){
		return ResponseEntity.ok(drs.comboReceita());
	}

}
