package com.craftconnect.craftconnectmono.app.products.entity;

import com.craftconnect.craftconnectmono.app.orders.entity.Order;
import com.craftconnect.craftconnectmono.app.images.entity.Image;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "PRODUCTS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String price;

    @Column(nullable = false, length = 200)
    private String stock;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Builder.Default
    @OneToMany(mappedBy = "product")
    private List<Order> orders = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "product")
    private List<Image> images = new ArrayList<>();
} 