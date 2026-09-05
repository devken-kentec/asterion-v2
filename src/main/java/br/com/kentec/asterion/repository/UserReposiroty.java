package br.com.kentec.asterion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.asterion.domain.User;

public interface UserReposiroty extends JpaRepository<User, Long>{

}
