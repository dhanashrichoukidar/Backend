package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.institute.model.EmployeeModel;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeModel empModel;

	public EmployeeController() {
		System.out.println("EmployeeController created...");
	}
	
	public void service() {
		empModel.saveEmployee();
	}
	
}