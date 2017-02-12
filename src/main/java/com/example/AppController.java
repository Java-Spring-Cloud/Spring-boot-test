package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value="/sayHello")
	public String sayHello(String name){
		return "Whats Up "+name;
	}

}
