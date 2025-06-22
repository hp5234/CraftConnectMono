package com.craftconnect.craftconnectmono.app.images.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageDto {
    private Long id;
    private Long productId;
    private Long taskRequestId;
    private String fileName;
    private String filePath;
    private Long fileSize;
    private String fileType;
} 