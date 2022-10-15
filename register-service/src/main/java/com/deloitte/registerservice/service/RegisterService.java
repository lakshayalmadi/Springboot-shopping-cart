package com.deloitte.registerservice.service;

import com.deloitte.registerservice.model.User;

public interface RegisterService {
	
	boolean verifyExistance(User user);
	
	User addUser(User user);
	

}
