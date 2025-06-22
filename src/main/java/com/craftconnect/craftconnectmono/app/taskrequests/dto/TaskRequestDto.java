package com.craftconnect.craftconnectmono.app.taskrequests.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskRequestDto {
    private Long id;
    private Long userId;
    private String description;
    private Integer amount;
    private Integer workingDay;
} 