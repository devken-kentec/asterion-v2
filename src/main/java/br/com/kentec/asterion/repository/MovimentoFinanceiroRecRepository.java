package br.com.kentec.asterion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.kentec.asterion.domain.MovimentoFinanceiroReceita;

public interface MovimentoFinanceiroRecRepository  extends JpaRepository<MovimentoFinanceiroReceita, Long>{
	
	
	@Query("SELECT mov FROM MovimentoFinanceiroReceita mov "
			+ "WHERE mov.dataReceita BETWEEN :dataInicial AND :dataFinal ")
	public List<MovimentoFinanceiroReceita> buscaAvancadaReceita(
			@Param("dataInicial") String dataInicial,
			@Param("dataFinal") String dataFinal);
}
