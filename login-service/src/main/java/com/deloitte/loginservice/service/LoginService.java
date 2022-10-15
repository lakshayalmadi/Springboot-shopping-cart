package com.deloitte.loginservice.service;

import com.deloitte.loginservice.model.UserLogin;

public interface LoginService {
	
	boolean authenticate(UserLogin userLogin);

}
