package com.craftconnect.craftconnectmono.app.products.controller;

import com.craftconnect.craftconnectmono.app.products.dto.ProductDto;
import com.craftconnect.craftconnectmono.app.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto productDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(productDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable Long id, @RequestBody ProductDto productDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(productDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new ProductDto());
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 