package com.craftconnect.craftconnectmono.app.payments.controller;

import com.craftconnect.craftconnectmono.app.payments.dto.PaymentDto;
import com.craftconnect.craftconnectmono.app.payments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentDto> create(@RequestBody PaymentDto paymentDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(paymentDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentDto> update(@PathVariable Long id, @RequestBody PaymentDto paymentDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(paymentDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new PaymentDto());
    }

    @GetMapping
    public ResponseEntity<List<PaymentDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 