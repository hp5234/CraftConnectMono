package com.craftconnect.craftconnectmono.app.products.repository;

import com.craftconnect.craftconnectmono.app.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
} 