package br.com.carlosjunior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
