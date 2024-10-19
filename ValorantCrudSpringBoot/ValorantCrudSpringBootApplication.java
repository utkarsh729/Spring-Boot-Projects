package com.example.utkarsh.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;

//import com.example.utkarsh.springcrud.models.Game_Character;
//import com.example.utkarsh.springcrud.services.CRUDService;

@SpringBootApplication
public class ValorantCrudSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValorantCrudSpringBootApplication.class, args);
//		ConfigurableApplicationContext con = SpringApplication.run(ValorantCrudSpringBootApplication.class, args);
		
		 
//		 Game_Character player1=con.getBean(Game_Character.class);
//		 
//		 player1.setName("Neon");
//		 player1.setPower(97);
//		 
//		 CRUDService cs=con.getBean(CRUDService.class);
//		 
//		 cs.createPlayer(player1);
		 
		 // we can insert data in this way but this is not good practice....and it is not followed
//		 
		 
	}

}
