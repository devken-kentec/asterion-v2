package br.com.kentec.asterion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.asterion.domain.MovimentoFinanceiroDespesa;

@Repository
public interface MovimentoFinanceiroDespRepository extends JpaRepository<MovimentoFinanceiroDespesa, Long> {
	
	@Query("SELECT mov FROM MovimentoFinanceiroDespesa mov "
			+ "WHERE mov.dataDespesa BETWEEN :dataInicial AND :dataFinal ")
	public List<MovimentoFinanceiroDespesa> buscaAvancadaDespesa(
			@Param("dataInicial") String dataInicial,
			@Param("dataFinal") String dataFinal);
}
