package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Task;
import com.institute.entity.User;
import com.institute.repository.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user/save")
	public ResponseEntity<String> saveUserInfo(@RequestBody User info) {
		repo.save(info);
		return new ResponseEntity<String>("User Saved Succesfully..", HttpStatus.CREATED);
	}
	
	@GetMapping("/user/get-all")
	public List<User> getAllUsers() {
		return repo.findAll();
		}
/*		
	// Update user 
	public List<User> getUserById (@RequestParam("id") int id){
		return null;
	//	return new List<User> (repo.getUserById(id));
	}
	@PutMapping("/user/update")
	public ResponseEntity<String> updateUserDetailsHql(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("contact") String contact, @RequestParam("id") int id) {
		repo.getUserById(id);
		repo.updateUserDetailsHql(name, email, contact, id);
		return new ResponseEntity<String> ("User Updated Successfully..",HttpStatus.OK);
	}
	*/
	
	@PutMapping("/user/update")
	public String  updateRecord(@RequestBody User user) {
		repo.save(user);
		return "record Updated successfully..";
	}
	
	
		
}
