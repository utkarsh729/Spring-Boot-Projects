package com.example.utkarsh.springcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utkarsh.springcrud.models.Game_Character;
import com.example.utkarsh.springcrud.repositories.GameCharacterRepository;

@Service  // @Component bhi likh sakte hai dono same hai...service bss readibility increase karne ke liye likh rahe
// now it is factory class object apne app banege
public class CRUDService {
	
	// all the bussiness logic is written service layer
	
	@Autowired  // automatically inject the dependency
	GameCharacterRepository gameCharacterRepository;
	
	public void createPlayer(Game_Character player1) {
		
		gameCharacterRepository.save(player1);
	}
	
	public Game_Character readPlayerById(int val) {
		return gameCharacterRepository.findById(val).get(); 
		// findById() will find the object and .get() object bana ke return kr dega
	}

	public void updateGameCharacter(Game_Character player1, int id) {
		
//		Game_Character updatePlayer = gameCharacterRepository.findById(id).get(); 
		// or
		Game_Character updatePlayer = readPlayerById(id);
//		
		updatePlayer.setName(player1.getName());
		updatePlayer.setPower(player1.getPower());
		
//		gameCharacterRepository.save(updatePlayer); 
		// or
		createPlayer(updatePlayer);
		
	}
	
	public void deleteGameCharacter(int id) {
		Game_Character player=readPlayerById(id);
		
		gameCharacterRepository.delete(player);
		
	}

	public List<Game_Character> readAll() {
		// TODO Auto-generated method stub
		List<Game_Character> list=gameCharacterRepository.findAll();
		return list;
	}
	

}
