package com.deloitte.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.productservice.model.Product;
import com.deloitte.productservice.repository.ProductRepo;


@Service
public interface ProductService{
	boolean verifyExistance(Product product);
	
	Product addProduct(Product product);
	
	List<Product> getProductList();
	
}
