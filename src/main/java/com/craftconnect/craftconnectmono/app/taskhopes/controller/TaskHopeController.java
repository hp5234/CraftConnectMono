package com.craftconnect.craftconnectmono.app.taskhopes.controller;

import com.craftconnect.craftconnectmono.app.taskhopes.dto.TaskHopeDto;
import com.craftconnect.craftconnectmono.app.taskhopes.service.TaskHopeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taskhopes")
@RequiredArgsConstructor
public class TaskHopeController {
    private final TaskHopeService taskHopeService;

    @PostMapping
    public ResponseEntity<TaskHopeDto> create(@RequestBody TaskHopeDto taskHopeDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(taskHopeDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskHopeDto> update(@PathVariable Long id, @RequestBody TaskHopeDto taskHopeDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(taskHopeDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskHopeDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new TaskHopeDto());
    }

    @GetMapping
    public ResponseEntity<List<TaskHopeDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 