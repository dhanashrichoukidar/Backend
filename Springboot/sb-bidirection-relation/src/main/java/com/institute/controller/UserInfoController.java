package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.UserInfo;
import com.institute.repository.UserInfoRepo;

@RestController
public class UserInfoController {

	@Autowired
	private UserInfoRepo repo;
	
	@PostMapping("/save-user-info")
	public ResponseEntity<String> saveUserInfo(@RequestBody UserInfo info) {
		repo.save(info);
		return new ResponseEntity<String>("User Save Succesfully..", HttpStatus.CREATED);
	}
	
	@GetMapping("get-user-by-id/{id}")
	public ResponseEntity<UserInfo> getById(@PathVariable int id) {
		return new ResponseEntity<UserInfo>(repo.findById(id).get(), HttpStatus.OK);	
	}
	
}