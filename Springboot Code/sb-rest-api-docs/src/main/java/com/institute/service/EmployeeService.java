package com.institute.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.institute.bean.EmployeeBean;

@Service
public class EmployeeService {

	ArrayList<EmployeeBean> empList = new ArrayList<EmployeeBean>();
	
	public void addEmp(EmployeeBean bean) {
		empList.add(bean);
	}
	
	
	public ArrayList<EmployeeBean> getAllEmployee() {
		return empList;
	}


	public EmployeeBean getEmpById(int id) {
		EmployeeBean bean = new EmployeeBean();
		for(EmployeeBean emp : empList) {
			if(emp.getId() == id) {
				bean = emp;
				break;
			}
		}
		return bean;
	}
	
	
	public void deleteEmpById(int id) {
		int index = -1;
		for(int i = 0 ; i<empList.size() ; i++) {
			if(empList.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			empList.remove(index);
		}
	}
	
}