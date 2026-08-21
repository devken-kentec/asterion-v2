package br.com.kentec.cold.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.cold.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	
	@Query("SELECT p FROM Post p "
			+ "JOIN p.tag t "
			+ "WHERE t.descricao = :tag ")
	List<Post> listarTodosPorTag(@Param("tag") String tag);
}
