package com.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Cart;
import com.project.entity.Product;
import com.project.repo.CartRepository;
import com.project.repo.ProductRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private ProductRepository productRepo;

    public Cart addToCart(Long cartId, Long productId) {
        Cart cart = cartRepo.findById(cartId).get();
        Product product = productRepo.findById(productId).get();

        cart.getProducts().add(product);
        return cartRepo.save(cart);
    }

    public Cart removeFromCart(Long cartId, Long productId) {
        Cart cart = cartRepo.findById(cartId).get();
        cart.getProducts().removeIf(p -> p.getId().equals(productId));
        return cartRepo.save(cart);
    }

    public Cart getCart(Long id) {
        return cartRepo.findById(id).get();
    }
}