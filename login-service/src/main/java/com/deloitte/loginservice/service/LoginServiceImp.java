package com.deloitte.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.loginservice.model.UserLogin;
import com.deloitte.loginservice.repository.LoginRepo;


@Service
public class LoginServiceImp implements LoginService{

	
	@Autowired
	private LoginRepo loginRepo;
	
	@Override
	public boolean authenticate(UserLogin userLogin) {
		// TODO Auto-generated method stub
		
		try {
			Long id = loginRepo.login(userLogin.getName(), userLogin.getPassword()).getId();
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}
	
}
