package com.craftconnect.craftconnectmono.app.orders.service;

import com.craftconnect.craftconnectmono.app.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
} 