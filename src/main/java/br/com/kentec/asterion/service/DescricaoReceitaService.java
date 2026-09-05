package br.com.kentec.asterion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.domain.DescricaoReceita;
import br.com.kentec.asterion.repository.DescricaoReceitaRepository;

@Service
public class DescricaoReceitaService {
	
	@Autowired
	private DescricaoReceitaRepository drr;
	
	public Iterable<DescricaoReceita> comboReceita(){
		return drr.comboReceita();
	}
}
