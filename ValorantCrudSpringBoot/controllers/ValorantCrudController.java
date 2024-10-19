package com.example.utkarsh.springcrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.utkarsh.springcrud.models.Game_Character;
import com.example.utkarsh.springcrud.services.CRUDService;

@RestController
public class ValorantCrudController {
	
	//CRUD
	
	//controller class ka kaam toh api expose krna hota hai
	//All api function should be public so that we can call it from outside
	
	//Create API endpoint - POST
	@Autowired
	CRUDService crudService;
	
	// create api endpoint
	@PostMapping(path="create")
	public void createPlayer(@RequestBody Game_Character player1) {  // input dene ke liye RequestBody ka use krte hai 
		crudService.createPlayer(player1); 
		// @RequestBody Game_Character player1 mean input de rahe hai Game_Character type ka
	}
	
	// read api endpoint
	// localhost:8080/read?id=val  (val can be primary key value)
	@GetMapping("read")
	public Game_Character readPlayerById(@RequestParam(name="id") int val) {
		
		return crudService.readPlayerById(val);
	}
	
	// update api endpoint
	@PutMapping("update")
	public void update(@RequestBody Game_Character player1 , @RequestParam(name="id") int id) {
		crudService.updateGameCharacter(player1, id);
	}	
	
	@DeleteMapping("delete")
	public void delete(int id) {
		crudService.deleteGameCharacter(id);
	}
	
	@GetMapping("readAll")
	public List<Game_Character> readAll(){
		return crudService.readAll();
	}
	
	@GetMapping
	public String s() {
		return "hello";
	}
}
