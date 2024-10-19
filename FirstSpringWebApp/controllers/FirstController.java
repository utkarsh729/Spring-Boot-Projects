package com.example.utkarsh.webApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// will convert class to restController and object creation is handle by spring boot container
@RestController
public class FirstController {
	
	//localhost:8080/search?q=value
	// search is api   or can say endpoint
	// q is request parameter or key
	// value is the value of q ...that we are assigning q with value value
	// eg ..localhost:8080/search?q=sachin  ...means q is request parameter that is assigned to value sachin
	
	// we are making get type api
	@GetMapping // this is default matching...for this localhost:8080
	public String defaultApi() {
		return "this is default api";
	}
	
	@GetMapping("search")  // on searching localhost:8080..give error as it is matched by search so type localhost:8080/search
	public String getHello() {
		return "Hello Spring ..this is seach api";
	}
	
	
	
	@GetMapping("searching")
	public String searchKro(@RequestParam(name="q") String value) {   // localhost:8080/searching?q=value ..replace value
		// request parameter name is q
		return value;
	}
	
	@GetMapping("searching2")
	public String utkarsh(@RequestParam(name="utkarsh") String value) {   // localhost:8080/searching?q=value ..replace value
		// request parameter is utkarsh
		return "Hello utkrash";  
	}
	
	@GetMapping("searchingpath/{crickter}")
	public String pathSearch(@PathVariable(name="crickter") String value) {
		return value;
	}
	// localhost:8080/searchingpath/MSDHONi
	// this is how we search via path
	
	
	// this is post api ..aur jo hum bracket mai likhte hai vo endpoint hota hai..mtlb kis endpoint pr hum post kr rahe..
	// localhost:8080/post
	@PostMapping(path="post")
	public void postKro() {
		// we post in json format..but here it is an just example how post api work 
		System.out.println("running post");
	}
	
	// if in postman we post http://localhost:8080/post then in console it will print runnin post as request is sucessfull
	// and if in postmant we post http://localhost:8080/post2 it will not post and give error as post2 does not exit .. request is unsuccessful

	

}
