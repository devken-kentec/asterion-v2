package br.com.kentec.asterion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.asterion.domain.DescricaoDespesa;
import br.com.kentec.asterion.service.DescricaoDespesaService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/descricaoDespesa")
public class DescricaoDespesaController {
	
	@Autowired
	private DescricaoDespesaService dds;
	
	@GetMapping("/despesaAtiva")
	public ResponseEntity<Iterable<DescricaoDespesa>> comboDespesa(){
		return ResponseEntity.ok(dds.comboDespesa());
	}
}
