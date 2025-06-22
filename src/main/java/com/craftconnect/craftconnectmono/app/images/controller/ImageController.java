package com.craftconnect.craftconnectmono.app.images.controller;

import com.craftconnect.craftconnectmono.app.images.dto.ImageDto;
import com.craftconnect.craftconnectmono.app.images.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping
    public ResponseEntity<ImageDto> create(@RequestBody ImageDto imageDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(imageDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImageDto> update(@PathVariable Long id, @RequestBody ImageDto imageDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(imageDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImageDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new ImageDto());
    }

    @GetMapping
    public ResponseEntity<List<ImageDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 