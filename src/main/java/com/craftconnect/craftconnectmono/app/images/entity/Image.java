package com.craftconnect.craftconnectmono.app.images.entity;

import com.craftconnect.craftconnectmono.app.products.entity.Product;
import com.craftconnect.craftconnectmono.app.taskrequests.entity.TaskRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "IMAGES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCTS_ID")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_REQUESTS_ID")
    private TaskRequest taskRequest;

    @Column(name = "FILE_NAME", nullable = false, length = 100)
    private String fileName;

    @Column(name = "FILE_PATH", nullable = false, length = 1024)
    private String filePath;

    @Column(name = "FILE_SIZE", nullable = false)
    private Long fileSize;

    @Column(name = "FILE_TYPE", nullable = false, length = 50)
    private String fileType;
} 