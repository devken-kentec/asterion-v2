package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.asterion.domain.MovimentoFinanceiroDespesa;

@Repository
public interface MovimentoFinanceiroDespRepository extends JpaRepository<MovimentoFinanceiroDespesa, Long> {

}
