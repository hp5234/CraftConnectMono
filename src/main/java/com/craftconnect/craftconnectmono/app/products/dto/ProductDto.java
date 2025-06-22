package com.craftconnect.craftconnectmono.app.products.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private String price;
    private String stock;
    private String description;
} 