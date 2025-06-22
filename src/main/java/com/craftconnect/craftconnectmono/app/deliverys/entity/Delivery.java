package com.craftconnect.craftconnectmono.app.deliverys.entity;

import com.craftconnect.craftconnectmono.app.orders.entity.Order;
import com.craftconnect.craftconnectmono.app.contracts.entity.Contract;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DELIVERYS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDERS_ID", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRCTS_ID")
    private Contract contract;

    @Column(length = 100)
    private String status;

    @Column(length = 100)
    private String destination;
} 