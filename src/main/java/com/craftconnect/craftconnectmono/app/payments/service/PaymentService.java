package com.craftconnect.craftconnectmono.app.payments.service;

import com.craftconnect.craftconnectmono.app.payments.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;
} 