package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AppController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//Get all Employee details
	@GetMapping("employees/all")
	public List<EmployeeDetails> getFunds() {
		return (List<EmployeeDetails>) employeeRepository.findAll();
	}
}
