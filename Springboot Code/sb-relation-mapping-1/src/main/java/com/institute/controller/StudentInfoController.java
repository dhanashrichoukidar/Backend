package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.StudentInfo;
import com.institute.repository.StudentInfoRepository;

@RestController
public class StudentInfoController {

	@Autowired
	private StudentInfoRepository infoRepository;
	
	@PostMapping("/create-stud-info")
	public ResponseEntity<String> saveStudInfo(@RequestBody StudentInfo info) {
		infoRepository.save(info);
		return new ResponseEntity<String>("Student Created Successfully..", HttpStatus.CREATED);
	}
	
	
}