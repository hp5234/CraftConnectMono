package com.craftconnect.craftconnectmono.app.products.service;

import com.craftconnect.craftconnectmono.app.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
} 