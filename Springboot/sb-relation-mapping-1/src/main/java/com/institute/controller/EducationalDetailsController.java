package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.EducationalDetails;
import com.institute.repository.EducationDetailRepository;

@RestController
public class EducationalDetailsController {

	@Autowired
	private EducationDetailRepository detailRepository;
	
	@PostMapping("/create-stud-education")
	public ResponseEntity<String> saveEducationalDetails(@RequestBody EducationalDetails details) {
		detailRepository.save(details);
		return new ResponseEntity<String>("Education Details Created Successfully", HttpStatus.CREATED);
	}
}