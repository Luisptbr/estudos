package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.dto.GameMinDTO;
//import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		var listarGemes = gameRepository.findAll();
		List<GameMinDTO> dto = listarGemes.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
		//Ou return listarGemes.stream().map(x -> new GameMinDTO(x)).toList();
	}
}

