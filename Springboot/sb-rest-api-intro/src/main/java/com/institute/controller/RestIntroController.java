package com.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestIntroController {
	//http://localhost:8080/say-hello -- REST API
		@GetMapping("/say-hello") //-- REST EndPoint
		public String sayHello() {
			System.out.println("Welcome To First REST API");
			return "Hello User, Welcome To First REST API";
		}
	}


