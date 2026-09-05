package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.kentec.asterion.domain.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
	
	@Query("SELECT p FROM Periodo p WHERE p.status = 'Ativo' ")
	Iterable<Periodo> periodoVigente(); 
}
