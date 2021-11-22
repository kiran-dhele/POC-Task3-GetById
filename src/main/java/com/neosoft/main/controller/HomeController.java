package com.neosoft.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.model.Student;
import com.neosoft.main.serviceInterf.ServiceInterf;

@RestController
public class HomeController {

	@Autowired
	ServiceInterf serviceInterf;

//This URL does not required any authentication.	
	@GetMapping("/")
	public String hello()
	{
		return "welcome without authentication";
	}
	
//This URL is used to get student by id but it required authentication like your email account.	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		Student student=serviceInterf.getStudentById(id);
		return student;
	}
}
