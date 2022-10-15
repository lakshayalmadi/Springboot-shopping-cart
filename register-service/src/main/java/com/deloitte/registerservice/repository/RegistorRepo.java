package com.deloitte.registerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.registerservice.model.User;

@Repository
public interface RegistorRepo  extends JpaRepository<User, Long>{
	
}
