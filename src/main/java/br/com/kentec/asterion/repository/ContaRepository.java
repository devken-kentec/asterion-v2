package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.asterion.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
