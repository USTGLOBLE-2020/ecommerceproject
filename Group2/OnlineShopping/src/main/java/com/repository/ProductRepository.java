package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Order;
import com.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
