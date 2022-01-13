package br.com.carlosjunior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
