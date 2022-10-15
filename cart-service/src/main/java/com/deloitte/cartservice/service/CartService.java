package com.deloitte.cartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.cartservice.model.Cart;
import com.deloitte.cartservice.repository.CartRepo;


@Service
public interface CartService {
	
	Cart addItemToCart(Cart cartItem);
	List<Cart> getUserCartItems(String username);

}