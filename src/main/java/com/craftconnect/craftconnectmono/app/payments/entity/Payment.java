package com.craftconnect.craftconnectmono.app.payments.entity;

import com.craftconnect.craftconnectmono.app.orders.entity.Order;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PAYMENTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDERS_ID", nullable = false)
    private Order order;

    @Column(length = 20)
    private String status;

    @Column(nullable = false)
    private Long price;
} 