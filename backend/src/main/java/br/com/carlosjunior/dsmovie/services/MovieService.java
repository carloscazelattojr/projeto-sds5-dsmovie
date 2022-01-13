package br.com.carlosjunior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.carlosjunior.dsmovie.dto.MovieDTO;
import br.com.carlosjunior.dsmovie.entities.Movie;
import br.com.carlosjunior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)	
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> listMovies =  repository.findAll(pageable);
		Page<MovieDTO> listMoviesDTO = listMovies.map( movie -> new MovieDTO(movie));
		return listMoviesDTO; 
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie movie = repository.findById(id).get();
		return new MovieDTO(movie);
	}
}
