package br.com.kentec.cold.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.cold.domain.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
