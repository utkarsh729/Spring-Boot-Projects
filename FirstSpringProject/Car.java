package com.example.utkarsh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  
@Scope("prototype") // by default its property is "singleton" that why only one object is created
public class Car {
// component annotation will tell the springboot that object of class can be made automatically...now Car class is factory
// springboot container will manage the factory class..make object and it store in its container
	
	
	private String name="maybach";
	private String color="red";
	
	public Car() {
		System.out.println("Constructor of Car");
	}
	
	@Autowired
	private Engine engine;
	// for making car we need engine..toh hum yaha autowired use karke engine ko inject kr rahe
	
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
