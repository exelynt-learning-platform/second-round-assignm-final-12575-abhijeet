package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Product;
import com.project.repo.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product addProduct(Product p) {
        return repo.save(p);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product updateProduct(Long id, Product p) {
        Product existing = getProduct(id);
        existing.setName(p.getName());
        existing.setPrice(p.getPrice());
        existing.setStock(p.getStock());
        existing.setDescription(p.getDescription());
        return repo.save(existing);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}