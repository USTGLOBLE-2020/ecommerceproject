package com.service;


import java.util.List;

import com.model.Order;
import com.model.Product;

public interface ProductService {
	public Product createProduct(Product product);
	
	public List<Product> getAllProductDetails();
}
