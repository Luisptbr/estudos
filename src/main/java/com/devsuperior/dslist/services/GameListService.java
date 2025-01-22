package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
@Service
public class GameListService {
	
	@Autowired
	public GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> listarTodos = gameListRepository.findAll(); 
		return listarTodos.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//		Game listarGames = gameRepository.findById(id).get();
//		return new GameDTO(listarGames);
//	}
}

