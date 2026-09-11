package br.com.kentec.asterion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.domain.Carteira;
import br.com.kentec.asterion.repository.CarteiraRepository;

@Service
public class CarteiraService {
	
	@Autowired
	private CarteiraRepository cr;
	
	public Iterable<Carteira> mostrarTodos() {
		return cr.findAll();
	}
}
