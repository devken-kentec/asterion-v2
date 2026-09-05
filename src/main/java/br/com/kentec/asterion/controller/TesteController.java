package br.com.kentec.asterion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="${origin.cors.url}", maxAge = 3600)
@RequestMapping("/asterion/api/v1")
public class TesteController {
	
	@GetMapping("/teste")
	public String comboReceita(){
		return "Teste Realizado";
	}
}
