package com.deloitte.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.loginservice.model.UserLogin;
import com.deloitte.loginservice.service.LoginService;
import com.deloitte.loginservice.service.LoginServiceImp;
import com.netflix.discovery.converters.Auto;

@RestController
public class LoginController {
	
	@Autowired
	private LoginServiceImp loginService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody UserLogin userLogin) {
		
		return loginService.authenticate(userLogin);
		
	}
	
	
	

}
