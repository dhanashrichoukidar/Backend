package com.institute.model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModel {
		public EmployeeModel() {
			System.out.println("EmployeeModel Object created...");
		}
		public void saveEmployee() {
			System.out.println("Employee Info Save....");
		}
}
