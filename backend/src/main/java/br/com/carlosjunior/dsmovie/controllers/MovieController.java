package br.com.carlosjunior.dsmovie.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.dsmovie.dto.MovieDTO;
import br.com.carlosjunior.dsmovie.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService service;

	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}

	@GetMapping("/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
