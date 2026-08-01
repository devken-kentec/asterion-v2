package br.com.kentec.cold.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kentec.cold.ColdApplication;
import br.com.kentec.cold.DTO.PostDTO;
import br.com.kentec.cold.domain.Autor;
import br.com.kentec.cold.domain.Post;
import br.com.kentec.cold.domain.Tag;
import br.com.kentec.cold.repository.AutorRepository;
import br.com.kentec.cold.repository.PostRepository;
import br.com.kentec.cold.repository.TagRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository pr;
	
	@Autowired
	private AutorRepository ar;
	
	@Autowired
	private TagRepository tr;

	public void save(PostDTO postDTO) {
		Optional<Autor> autor = ar.findById(postDTO.getAutorId());
		Optional<Tag> tag = tr.findById(postDTO.getTagId());
		
 		Post post = new Post();
		post.setTitulo(postDTO.getTitulo());
		post.setResumo(postDTO.getResumo());
		post.setDataPostagem(postDTO.getDataPostagem());
		post.setConteudo(postDTO.getConteudo());
		post.setAutor(autor.get());
		post.setTag(tag.get());
		post.setStatus(postDTO.getStatus());
		pr.save(post);
		System.out.println(post);
	}
}
