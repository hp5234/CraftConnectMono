package com.craftconnect.craftconnectmono.app.deliverys.repository;

import com.craftconnect.craftconnectmono.app.deliverys.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
} 