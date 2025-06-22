package com.craftconnect.craftconnectmono.app.taskhopes.service;

import com.craftconnect.craftconnectmono.app.taskhopes.repository.TaskHopeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskHopeService {
    private final TaskHopeRepository taskHopeRepository;
} 