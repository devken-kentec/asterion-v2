package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.kentec.asterion.domain.DescricaoReceita;

@Repository
public interface DescricaoReceitaRepository extends JpaRepository<DescricaoReceita, Long>{
	
	@Query("SELECT dr FROM DescricaoReceita dr WHERE dr.status = 'Ativo' ")
	Iterable<DescricaoReceita> comboReceita();
}
