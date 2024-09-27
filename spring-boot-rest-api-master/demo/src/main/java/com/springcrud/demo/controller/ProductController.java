package com.springcrud.demo.controller;

import com.springcrud.demo.model.Product;
import com.springcrud.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/products")

public class ProductController {
	@Autowired
    ProductService productService;

	@GetMapping("")
    public List<Product> list() {
        return productService.listAllProduct();
    }

    @GetMapping("/{pid}")
    public ResponseEntity<Product> get(@PathVariable Integer pid) {
        try {
            Product product = productService.getProduct(pid);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Product product) {
        productService.saveProduct(product);
    }
    @PutMapping("/{pid}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer pid) {
        try {
        	Product existProduct = productService.getProduct(pid);
			product.setPid(pid);
            productService.saveProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{pid}")
    public void delete(@PathVariable Integer pid) {

        productService.deleteProduct(pid);
    }
}
