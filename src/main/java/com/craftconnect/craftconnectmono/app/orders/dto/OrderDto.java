package com.craftconnect.craftconnectmono.app.orders.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Long id;
    private Long productId;
    private Long userId;
    private String status;
} 