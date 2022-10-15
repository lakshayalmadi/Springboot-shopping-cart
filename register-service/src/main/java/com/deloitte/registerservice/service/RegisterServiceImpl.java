package com.deloitte.registerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.registerservice.model.User;
import com.deloitte.registerservice.repository.RegistorRepo;

@Service
public class RegisterServiceImpl  implements RegisterService{
	
	@Autowired
	private RegistorRepo registorRepo;

	@Override
	public boolean verifyExistance(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return registorRepo.save(user);
	}

}
