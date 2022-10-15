package com.deloitte.registerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.registerservice.model.User;
import com.deloitte.registerservice.service.RegisterServiceImpl;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterServiceImpl registerService;
	

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		
		User u;
		try {
			u =  registerService.addUser(user);
		}catch(Exception e) {
			u = new User("Invalid", "Invalid", "Invalid", "Invalid", "Invalid");
		}
		return u;
		
	}

}
