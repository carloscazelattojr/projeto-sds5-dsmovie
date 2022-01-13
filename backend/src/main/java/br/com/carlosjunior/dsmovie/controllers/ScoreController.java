package br.com.carlosjunior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.dsmovie.dto.MovieDTO;
import br.com.carlosjunior.dsmovie.dto.ScoreDTO;
import br.com.carlosjunior.dsmovie.services.ScoreService;

@RestController
@RequestMapping("/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping()
	public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {

		MovieDTO movieDTO = service.saveScore(scoreDTO);
		return movieDTO;
	}

}
