package com.deloitte.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.productservice.model.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Long>{
	
}
