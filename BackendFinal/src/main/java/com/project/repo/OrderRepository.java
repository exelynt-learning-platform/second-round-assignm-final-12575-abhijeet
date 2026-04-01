package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
