package com.craftconnect.craftconnectmono.app.taskrequests.controller;

import com.craftconnect.craftconnectmono.app.taskrequests.dto.TaskRequestDto;
import com.craftconnect.craftconnectmono.app.taskrequests.service.TaskRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taskrequests")
@RequiredArgsConstructor
public class TaskRequestController {
    private final TaskRequestService taskRequestService;

    @PostMapping
    public ResponseEntity<TaskRequestDto> create(@RequestBody TaskRequestDto taskRequestDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(taskRequestDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskRequestDto> update(@PathVariable Long id, @RequestBody TaskRequestDto taskRequestDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(taskRequestDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskRequestDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new TaskRequestDto());
    }

    @GetMapping
    public ResponseEntity<List<TaskRequestDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 