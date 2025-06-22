package com.craftconnect.craftconnectmono.app.payments.repository;

import com.craftconnect.craftconnectmono.app.payments.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
} 