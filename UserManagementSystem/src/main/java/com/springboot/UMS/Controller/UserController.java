package com.springboot.UMS.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.UMS.Dao.UserRepository;
import com.springboot.UMS.bean.User;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;
	
	@PostMapping("/addAllUser")
	public String insetUser(@RequestBody List<User> user) {
		repository.saveAll(user);
		return "ADDED ALL USERS";
		}
	
	@GetMapping("/getAllUser")
	public List<User> getUser() {
		return (List<User>) repository.findAll();
		
		}
	
		
		  @GetMapping("/getByUserName/{name}") 
		  public List<User> getUser(@PathVariable("name")String userName) { 
			      return (List<User>)
	     	  repository.findAllByuserName(userName); }
		 
		
	  @GetMapping("/getByUserId/{userId}")
		
		  public Optional<User> getUser(@PathVariable("userId") Long id) { 
			  return repository.findById(id);
			  }
	  @PutMapping("/getByUserId/{userId}")
	  public List<User> deleteUser(@PathVariable("userId") Long id) {
		  repository.deleteById(id);
		return null;		  
	  }
		
		 
}
