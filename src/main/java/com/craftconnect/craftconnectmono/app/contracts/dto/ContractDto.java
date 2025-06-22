package com.craftconnect.craftconnectmono.app.contracts.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContractDto {
    private Long id;
    private Long taskRequestId;
    private Long taskHopeId;
    private Integer amount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer maxEditCount;
    private Long pricePerOne;
    private String status;
    private String type;
} 