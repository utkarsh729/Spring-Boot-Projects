package com.example.utkarsh.springcrud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.utkarsh.springcrud.models.Game_Character;


@Repository  // or @Component ...for readibility
public interface GameCharacterRepository extends JpaRepository<Game_Character, Integer> {
	//JpaRepository is generic interface which takes class(model) and id types(Integer here) as parameter
	
	//all the things are implemented in Jpa Repository like we done in hibernate..entitymanagerfactory, transaction, etc;
		
}
