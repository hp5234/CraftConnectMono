package com.craftconnect.craftconnectmono.app.deliverys.service;

import com.craftconnect.craftconnectmono.app.deliverys.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;
} 