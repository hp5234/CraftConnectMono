package com.craftconnect.craftconnectmono.app.users.controller;

import com.craftconnect.craftconnectmono.app.users.dto.UserDto;
import com.craftconnect.craftconnectmono.app.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
        // TODO: 실제 저장 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable Long id, @RequestBody UserDto userDto) {
        // TODO: 실제 수정 로직 구현 필요 (DTO -> Entity 변환)
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: 실제 삭제 로직 구현 필요
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getOne(@PathVariable Long id) {
        // TODO: 실제 단일 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(new UserDto());
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        // TODO: 실제 목록 조회 로직 구현 필요 (Entity -> DTO 변환)
        return ResponseEntity.ok(List.of());
    }
} 