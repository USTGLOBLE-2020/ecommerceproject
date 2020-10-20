package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Order;
import com.model.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/*
	 * Saving product
	 */
	
	@PostMapping("/createProduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok().body(this.productService.createProduct(product));
	}
	
	/*
	 * listing all product
	 */
	
	
	@GetMapping("/getAllProductDetails")
	public ResponseEntity<List<Product>> getAllProductDetails(){
		System.out.println("getAllProducts");
		return ResponseEntity.ok().body(productService.getAllProductDetails());
	}
}
