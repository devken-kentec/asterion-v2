package br.com.kentec.cold.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.cold.domain.Tag;
import br.com.kentec.cold.repository.TagRepository;

@Service
public class TagService {
	
	@Autowired
	private TagRepository tr;
	
	public void cadastrar(Tag tag) {
		tr.save(tag);
	}
	
	public List<Tag> listarTodos(){
		return tr.findAll();
	}

}
