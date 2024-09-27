package com.springcrud.demo.service;

import com.springcrud.demo.model.Product;
import com.springcrud.demo.model.User;
import com.springcrud.demo.repository.ProductRepository;
import com.springcrud.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;
@Service
@Transactional
public class ProductService {


    @Autowired
    private ProductRepository productRepository;
    public List<Product> listAllProduct() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProduct(Integer pid) {
        return (productRepository.findById(pid)).get();
    }

    public void deleteProduct(Integer pid) {
        productRepository.deleteById(pid);
    }

}
