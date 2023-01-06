package com.springcrud.demo.repository;

import com.springcrud.demo.model.User;
import com.springcrud.demo.service.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
//	@Query("SELECT u.first_name as name , p.productName ad Product_name FROM User u left outer join products p where u.id = p.pid")
//	@Query("select u.first_name, p.productName FROM User u JOIN u.products p")
//	@Query("SELECT u.first_name, u.last_name, u.id, p.product_name, p.id, p.qty, p.price FROM users u INNER JOIN products p ON p.pid = u.id;")
//	public List<ProductService> getJoinInformation();
	
//	Optional<User> findByUserName(String user);
}
