package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Cart;
import com.project.serviceImpl.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/{cartId}/add/{productId}")
    public Cart addToCart(@PathVariable Long cartId, @PathVariable Long productId) {
        return service.addToCart(cartId, productId);
    }

    @DeleteMapping("/{cartId}/remove/{productId}")
    public Cart remove(@PathVariable Long cartId, @PathVariable Long productId) {
        return service.removeFromCart(cartId, productId);
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {
        return service.getCart(id);
    }
}