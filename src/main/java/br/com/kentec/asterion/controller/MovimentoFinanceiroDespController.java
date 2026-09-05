package br.com.kentec.asterion.controller;

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

import br.com.kentec.asterion.DTO.MovimentoFinanceiroDespDTO;
import br.com.kentec.asterion.domain.MovimentoFinanceiroDespesa;
import br.com.kentec.asterion.service.MovimentoFinanceiroDespService;

@RestController
@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1/movimentoFinanceiro")
public class MovimentoFinanceiroDespController {
	
	@Autowired
	private MovimentoFinanceiroDespService mfds;
	
	@GetMapping("/listaDespesa")
	public ResponseEntity<List<MovimentoFinanceiroDespDTO>> listarTodasDespesas(){
		return ResponseEntity.ok(mfds.listarTodasDespesas());      
	}
	
	@PostMapping("/despesa")
	@ResponseStatus(HttpStatus.CREATED)
	public MovimentoFinanceiroDespesa cadastrar(@RequestBody MovimentoFinanceiroDespDTO movimentoFinanceiroDTO) {
		return mfds.salvarDespesa(movimentoFinanceiroDTO);
	}

}
