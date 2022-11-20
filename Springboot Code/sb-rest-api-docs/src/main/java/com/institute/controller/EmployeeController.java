package com.institute.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.bean.EmployeeBean;
import com.institute.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create-emp")
	public String saveEmp(@RequestBody EmployeeBean bean) {
		employeeService.addEmp(bean);
		return "Employee Created Successfully...";
	}
	
	@GetMapping("/get-all-emp")
	public ArrayList<EmployeeBean> getAll() {
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/get-emp-by-id/{eid}")
	public EmployeeBean getById(@PathVariable("eid") int id) {
		return employeeService.getEmpById(id);
	}
	
	@DeleteMapping("/delete-emp-by-id")
	public String deleteData(@RequestParam("eid") int id) {
		employeeService.deleteEmpById(id);
		return "Employee Deleted Successfully...";
	}
	
	
}










