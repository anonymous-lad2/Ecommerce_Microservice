package com.happysat.microservices.product.repository;

import com.happysat.microservices.product.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
