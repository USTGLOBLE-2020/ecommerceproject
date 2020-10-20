package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;
import com.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{


	@Autowired
	private ProductRepository productRepository;



	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}


	@Override
	public List<Product> getAllProductDetails() {
		return this.productRepository.findAll();
	}





}
