package com.deloitte.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.productservice.model.Product;
import com.deloitte.productservice.repository.ProductRepo;


@Service
public class ProductServiceImp implements ProductService{
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean verifyExistance(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
}
