package com.springcrud.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.springcrud.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Optional<Product> findByProductName(String product);

}
