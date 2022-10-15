package com.deloitte.cartservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.cartservice.model.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long>{
	List<Cart> findByName(String username);
	

}