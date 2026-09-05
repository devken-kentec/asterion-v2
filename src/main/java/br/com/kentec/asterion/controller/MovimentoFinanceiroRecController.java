package br.com.kentec.asterion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.kentec.asterion.DTO.MovimentoFinanceiroRecDTO;
import br.com.kentec.asterion.domain.MovimentoFinanceiroReceita;
import br.com.kentec.asterion.service.MovimentoFinanceiroRecService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/movimentoFinanceiro")
public class MovimentoFinanceiroRecController {
	
	@Autowired
	private MovimentoFinanceiroRecService mfrs;
	
	@GetMapping("/listaReceita")
	public ResponseEntity<List<MovimentoFinanceiroRecDTO>> listarTodasReceitas(){
		return ResponseEntity.ok(mfrs.listarTodasReceitas());      
	}
	
	@PostMapping("/receita")
	@ResponseStatus(HttpStatus.CREATED)
	public MovimentoFinanceiroReceita cadastrar(@RequestBody MovimentoFinanceiroRecDTO movimentoFinanceiroDTO) {
		return mfrs.salvarReceita(movimentoFinanceiroDTO);
		
	}	
}
