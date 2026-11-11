package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.asterion.domain.Caixa;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long>{

}
