package com.deloitte.loginservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.loginservice.model.User;

@Repository
public interface LoginRepo extends JpaRepository<User, Long>{
	
	@Query(value = "SELECT * FROM USERS WHERE name = ?1 and password =?2",nativeQuery = true)
	User login(String name, String password);
	
}
