package com.craftconnect.craftconnectmono.app.deliverys.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryDto {
    private Long id;
    private Long orderId;
    private Long contractId;
    private String status;
    private String destination;
} 