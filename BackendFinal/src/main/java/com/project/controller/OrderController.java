package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Order;
import com.project.serviceImpl.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/{cartId}")
    public Order createOrder(@PathVariable Long cartId) {
        return service.createOrder(cartId);
    }

    @GetMapping
    public List<Order> getAll() {
        return service.getAllOrders();
    }
}