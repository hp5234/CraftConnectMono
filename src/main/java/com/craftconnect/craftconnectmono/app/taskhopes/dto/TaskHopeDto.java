package com.craftconnect.craftconnectmono.app.taskhopes.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskHopeDto {
    private Long id;
    private Long taskRequestId;
    private Long userId;
    private Integer minAmount;
    private Integer maxEditCount;
    private Long pricePerOne;
    private String description;
} 