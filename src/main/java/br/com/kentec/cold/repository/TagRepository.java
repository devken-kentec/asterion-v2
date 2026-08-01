package br.com.kentec.cold.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.cold.domain.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
