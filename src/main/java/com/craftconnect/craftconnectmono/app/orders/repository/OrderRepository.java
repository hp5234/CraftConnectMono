package com.craftconnect.craftconnectmono.app.orders.repository;

import com.craftconnect.craftconnectmono.app.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
} 