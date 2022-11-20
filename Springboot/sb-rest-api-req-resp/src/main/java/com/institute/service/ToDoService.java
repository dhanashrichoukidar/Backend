package com.institute.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.institute.bean.ToDoBean;

@Service                            //step 6
public class ToDoService {         //step 5
	
	ArrayList<ToDoBean> list = new ArrayList<ToDoBean>(); //step 7
	
	public void addTask(ToDoBean task) {     //step 8
		list.add(task);
	}
	
	public List<ToDoBean> getAllTask() {     //step 9
		return list;
	}
	
	public List<ToDoBean> getTaskByDate(String date) {    // step 15
		ArrayList<ToDoBean> filterData = new ArrayList<ToDoBean>();
		
		for(ToDoBean bean : list) {
			if(bean.getCreatedOn().equals(date)) {
				filterData.add(bean);
			}
		}
		
		return filterData;
	}
	
}