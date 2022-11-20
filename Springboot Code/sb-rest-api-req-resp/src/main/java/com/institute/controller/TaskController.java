package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.bean.ToDoBean;
import com.institute.service.ToDoService;

@RestController  //step 2
public class TaskController {   //step 3
	
	@Autowired
	private ToDoService todoService; // DI process
	
	
	@PostMapping("/create-task")     // http://localhost:8080/create-task is the url for creating task, you have to select post method and have to write object in body--> raw-->JSON and click send
	public String addTaskDetails(@RequestBody ToDoBean task) {   // @RequestBody is used to get the parameters from user  - step 4
		System.out.println("Title : " + task.getTitle());
		System.out.println("Status : " + task.getStatus());
		System.out.println("CreatedDate : " + task.getCreatedOn());
		todoService.addTask(task);
		return "Task Created Successfully...";
	}
	
	
	@GetMapping("/get-all-task")   //http:localhost:8080/get-all-task is the url for getting all data present       //step 11
	public List<ToDoBean> getAllTaskDetails() {     //step 10
		return todoService.getAllTask();            //step 12
	}
	
	
	@GetMapping("/get-by-date")   //http:localhost:8080/get-by-date?3/11/2022  is the url for getting all data available to that date only  -step 14
	public List<ToDoBean> getTaskDetailsByDate(@RequestParam("date") String date) {     //step 13
		System.out.println("Date : " + date);
		return todoService.getTaskByDate(date);   //step 16
	}
	
	
	
	
	
	
	
	
}