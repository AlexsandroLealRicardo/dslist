package com.sandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
