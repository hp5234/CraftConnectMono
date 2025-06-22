package com.craftconnect.craftconnectmono.app.orders.entity;

import com.craftconnect.craftconnectmono.app.products.entity.Product;
import com.craftconnect.craftconnectmono.app.users.entity.User;
import com.craftconnect.craftconnectmono.app.payments.entity.Payment;
import com.craftconnect.craftconnectmono.app.deliverys.entity.Delivery;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "ORDERS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCTS_ID", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_ID", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String status;

    @Builder.Default
    @OneToMany(mappedBy = "order")
    private List<Payment> payments = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "order")
    private List<Delivery> deliverys = new ArrayList<>();
} 