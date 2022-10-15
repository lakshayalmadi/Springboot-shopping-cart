package com.deloitte.cartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.cartservice.model.Cart;
import com.deloitte.cartservice.repository.CartRepo;

@Service
public class CartServiceImp implements CartService {
	
	
	@Autowired
	private CartRepo cartRepo;

	@Override
	public Cart addItemToCart(Cart cartItem) {
		// TODO Auto-generated method stub
		return cartRepo.save(cartItem);
	}

	@Override
	public List<Cart> getUserCartItems(String username) {
		// TODO Auto-generated method stub
		return cartRepo.findByName(username);
	}
}