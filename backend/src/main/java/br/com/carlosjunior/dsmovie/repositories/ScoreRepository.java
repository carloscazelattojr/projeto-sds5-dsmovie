package br.com.carlosjunior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.dsmovie.entities.Score;
import br.com.carlosjunior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
