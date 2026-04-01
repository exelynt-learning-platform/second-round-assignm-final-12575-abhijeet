package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Cart;
import com.project.entity.Order;
import com.project.entity.Product;
import com.project.repo.CartRepository;
import com.project.repo.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private CartRepository cartRepo;

    public Order createOrder(Long cartId) {
        Cart cart = cartRepo.findById(cartId).get();

        Order order = new Order();
        order.setUser(cart.getUser());
        order.setProducts(cart.getProducts());

        double total = cart.getProducts()
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();

        order.setTotalPrice(total);
        order.setStatus("CREATED");

        return orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}