package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Task;
import com.institute.repository.TaskRepo;

@RestController
public class TaskController {

	@Autowired
	private TaskRepo repo;
	
	@PostMapping("/save-task")
	public ResponseEntity<String> saveTask(@RequestBody Task info) {
		repo.save(info);
		return new ResponseEntity<String>("Task Created Succesfully..", HttpStatus.CREATED);
	}
	
	@GetMapping("get-task-by-id/{id}")
	public ResponseEntity<Task> getById(@PathVariable int id) {
		return new ResponseEntity<Task>(repo.findById(id).get(), HttpStatus.OK);	
	}
}