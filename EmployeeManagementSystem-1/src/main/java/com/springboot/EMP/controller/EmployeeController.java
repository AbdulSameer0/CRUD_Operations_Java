package com.springboot.EMP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/adadd")
	public String show() {
		return"ADDED!!!";
	}

}
