package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {}