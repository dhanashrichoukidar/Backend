package com.institute.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.institute.entity.Task;
import com.institute.entity.User;
import com.institute.repository.TaskRepo;
import com.institute.repository.UserRepo;

@RestController
public class TaskController {

	@Autowired
	private TaskRepo repo;
	
	@PostMapping("/task/save")
	public ResponseEntity<String> saveUserTask(@RequestBody Task info) {
		repo.save(info);
		return new ResponseEntity<String>("Task Saved Succesfully..", HttpStatus.CREATED);
	}
	
	/*
	@PutMapping("/task/update")
	public ResponseEntity<String> updateTaskDetailsHql(@RequestParam("title") String title,@RequestParam("status") String status,@RequestParam("createdDate") String createdDate,@RequestParam("updatedDate") String updatedDate, @RequestParam("id") int id) {
		repo.updateTaskDetailsHql(title, status, createdDate,updatedDate, id);
		return new ResponseEntity<String> ("User Updated Successfully..",HttpStatus.OK);
	}
	*/
	
	@PutMapping("/task/update/{id}/{status}")
	public ResponseEntity<String> updateStatusByIdHql( @PathVariable("status") String status, @PathVariable("id") int id ) {
		repo.updateStatusByIdHql(status, id);
		return new ResponseEntity<String> ("status updated successfully....",HttpStatus.OK);
	}
	
	@DeleteMapping("/task/delete-by-id/{id}")
	public ResponseEntity<String> deleteTaskByIdHql(@PathVariable("id") int id) {
		repo.deleteTaskByIdHql(id);
		return new ResponseEntity<String>("Task Deleted Succesfully..", HttpStatus.OK);
	}
	
	@PutMapping("/task/update")
	public String  updateRecord(@RequestBody Task task) {
		repo.save(task);
		return "record Updated successfully..";
	}

	
	@GetMapping("/task/task-by-id")
	public ResponseEntity<Task> getTaskById(@RequestParam("id") int id) {
			repo.getTaskById(id);
			return new ResponseEntity<Task> (repo.getTaskById(id),HttpStatus.OK );  //
			}
			
	
	
	@GetMapping("/task/task-by-status")
	public ResponseEntity<Task> getTaskByStatus(@RequestParam("status") String status) {
			repo.getTaskByStatus(status);
			return new ResponseEntity<Task> (repo.getTaskByStatus(status),HttpStatus.OK );  //
			}
	
	@DeleteMapping("/task/delete-by-user")
	public ResponseEntity<String> deleteTaskByUserIdHql(@RequestParam("uid") int uid) {
		repo.deleteTaskByUserIdHql(uid);
		return new ResponseEntity<String>("Task Deleted Succesfully..", HttpStatus.OK);
	}

}
	

