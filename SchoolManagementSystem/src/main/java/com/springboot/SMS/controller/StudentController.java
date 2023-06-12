package com.springboot.SMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SMS.Entity.Student;
import com.springboot.SMS.Service.StudentService;

@RestController
public class StudentController {
	/*
	 * @GetMapping("/okk") public String show() { return "ok"; }
	 */
	@Autowired
	private StudentService studentService;
	
	
	   @GetMapping("/addinfo")
	    public List<Student> getinfo(){
		return studentService.getbook();
       }
	   @PostMapping("/addStudent")
	   public String addStudent(@RequestBody Student student) {
		   studentService.getbook();
		return "ADDED!!!";
		   
	   }
}
