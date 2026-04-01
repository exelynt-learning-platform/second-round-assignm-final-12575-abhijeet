package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.serviceImpl.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product p) {
        return new ResponseEntity<>(service.addProduct(p), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product p) {
        return service.updateProduct(id, p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProduct(id);
    }
}