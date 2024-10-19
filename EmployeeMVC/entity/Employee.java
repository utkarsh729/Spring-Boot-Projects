package com.example.utkarsh.employeeMVCProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {  
	
	// entity or model
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private String  lastName;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
