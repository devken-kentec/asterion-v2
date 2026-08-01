package br.com.kentec.cold.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.cold.domain.Autor;
import br.com.kentec.cold.repository.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository ar; 
	
	public void cadastrar(Autor autor) {
		ar.save(autor);
	}
	
	public List<Autor> listarTodos(){
		return ar.findAll();
	}
}
