package com.example.utkarsh.employeeMVCProject.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.utkarsh.employeeMVCProject.entity.Employee;

@RestController
public class EmployeeController {
	
	
	// model= data
	// view= html page
	// controller return model and view 
	@GetMapping()
	public String sayHello() {
		return "Thymeleaf";
	}
	
	@GetMapping("/getForm")
	public ModelAndView getRegistration() {
		String viewName = "Register";  // view is html file
		Map<String, Object> model= new HashMap<>();
		
//		model.put("displaykaronaam", "Golu");
		//model.put(variable, data)
		
		Employee e=new Employee();
		e.setName("firstname");
		e.setLastName("lastname");
		
		model.put("employeeEntry", e);
		
		
		return new ModelAndView(viewName, model);
	}
}
