package com.deloitte.cartservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long id;
	@Column(name = "username", nullable=false)
	String name;
	@Column(name = "password",nullable = false)
	String password;
	@Column(name = "productId", nullable = false)
	long productId;
	@Column(name = "quantity", nullable = false)
	Long quantity;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String name, String password, long productId, Long quantity) {
		super();
		this.name = name;
		this.password = password;
		this.productId = productId;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}	

}