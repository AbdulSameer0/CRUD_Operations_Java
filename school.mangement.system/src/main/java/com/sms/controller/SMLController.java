package com.sms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.dao.SMSRepositroy;
import com.sms.entity.Student;
import com.sms.service.SmsService;

@RestController
public class SMLController {
	/*
	 * @GetMapping ("/add") public String getData() { return "adede!!"; }
	 */
	@Autowired
	SmsService service;
	@Autowired
	SMSRepositroy repositroy;
	
	@PostMapping("/insertData")
    public String insertStd(@RequestBody Student student) {
    	service.insertDate(student);
    	return "ADDED";
    }
	@PostMapping("/multipulDataInsert")
	public String insertMultipul(@RequestBody List<Student> students) {
		service.insertMultipul(students);
		return "ADDED ALL DATA!!!";
	}
	@GetMapping("/findAllData")
	public ArrayList<Student> findAllData(Student student){
	   return	(ArrayList<Student>) service.findAll(student);
	}
	@GetMapping("/findDataById/{id}")
	public Optional<Student> getData(@PathVariable int id) {
		return service.findBYId(id);
		
	}
	@PutMapping("/updataById")
	public String updateStd(@RequestBody Student student) {
		service.updateById(student);
		return "Update!!";
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteData(@PathVariable @Validated int id) {
		service.deleteBYId(id);
		return "DELETE!!"; 	
	}
	
	 
}
