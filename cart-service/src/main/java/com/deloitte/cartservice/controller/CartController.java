package com.deloitte.cartservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.cartservice.model.Cart;
import com.deloitte.cartservice.model.UserLogin;
import com.deloitte.cartservice.service.CartServiceImp;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class CartController {
	
	@Autowired
	private CartServiceImp cartService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/addItemToCart")
	public String addItemToCart(@RequestBody Cart cartItem) {
		
	org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		String requestJson;
		ResponseEntity<Boolean> response;
		
		Cart item;
		try {
			UserLogin userLogin = new UserLogin(cartItem.getName(),cartItem.getPassword());
			
			requestJson = mapper.writeValueAsString(userLogin);
			
			
			HttpEntity<String>  request = new HttpEntity<>(requestJson,headers);
			String url = "http://localhost:9192/login";
			
			response = restTemplate.postForEntity(url, requestJson, Boolean.class);
			
			return response.getBody().toString();
			
			
			
		}catch(Exception e) {
			item = new Cart();
			item.setName(e.getMessage());
		}
		return "Yes";
	}
	
	@PostMapping("/getUserCartItems/{user_id}")
	public List<Cart> getUserCartItems(@PathVariable String username){
		List<Cart> list ;
		Cart c = new Cart();
		
		try {
			list  = cartService.getUserCartItems(username);
	
			
		}catch(Exception e) {
			c.setPassword(e.getMessage());
			list  = new ArrayList<>();
					list.add(c);
		}
		return list;
		
	}

}