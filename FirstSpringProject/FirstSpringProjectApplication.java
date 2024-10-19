package com.example.utkarsh.spring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstSpringProjectApplication.class, args);
		// it will return context ...and we are not catching it
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
		// this is an springboot container which manages the object of the classes
		// context is an instance of the whole application 
		
//		Car car1=new Car();
//		Engine engine1=new Engine();
//		car1.setEngine(engine1);
		// this is the example of one person is only making all the things...and we have to repeatedly do it for n cars
		
		Car car1=context.getBean(Car.class);   //in spring, object or instance ko hum springbeans bolte hai
		System.out.println(car1.getColor());
		System.out.println(car1);
		
		
//		Car car2=context.getBean(Car.class);
//		System.out.println(car2);
//		
//		Car car3=context.getBean(Car.class);
//		System.out.println(car3);
		
		// car1 , car2 and car3 are referring to same object or singleton bean
		// constructor will called as one time
		
		

		Car car2=context.getBean(Car.class);
		System.out.println(car2);
		
		Car car3=context.getBean(Car.class);
		System.out.println(car3);
		
		// now they all are referring to different object as we have change the property in scope to prototype
		// constructor is call three times
		// prototype give different object every time
		
		System.out.println(car3.getEngine().getCc());
	
		
		
	}

}
