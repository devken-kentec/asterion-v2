package br.com.kentec.asterion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.domain.Periodo;
import br.com.kentec.asterion.repository.PeriodoRepository;

@Service
public class PeriodoService {
	
	@Autowired
	private PeriodoRepository pr;
	
	public Iterable<Periodo> periodoVigente(){
		return pr.periodoVigente();
	}
}
