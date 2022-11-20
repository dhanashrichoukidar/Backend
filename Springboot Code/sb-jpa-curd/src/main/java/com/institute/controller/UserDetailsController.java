package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.UserDetails;
import com.institute.repository.UserDetailsRepository;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsRepository repository;
	
	@PostMapping("/register-user")
	public String saveUserDetails(@RequestBody UserDetails details) {
		repository.save(details);
		return "User Register Successfully";
	}
	
	
}