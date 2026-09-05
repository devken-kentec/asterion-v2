package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.kentec.asterion.domain.DescricaoDespesa;


public interface DescricaoDespesaRepository extends JpaRepository<DescricaoDespesa, Long> {
	
	@Query("SELECT dd FROM DescricaoDespesa dd WHERE dd.status = 'Ativo' ")
	Iterable<DescricaoDespesa> comboDespesa();
	
}
