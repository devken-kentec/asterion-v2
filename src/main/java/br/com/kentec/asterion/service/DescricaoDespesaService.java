package br.com.kentec.asterion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.domain.DescricaoDespesa;
import br.com.kentec.asterion.repository.DescricaoDespesaRepository;

@Service
public class DescricaoDespesaService {
	
	@Autowired
	private DescricaoDespesaRepository ddr;
	
	public Iterable<DescricaoDespesa> comboDespesa(){
		return ddr.comboDespesa();
	}
}
