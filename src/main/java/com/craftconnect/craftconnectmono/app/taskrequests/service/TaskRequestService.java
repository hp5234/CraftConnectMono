package com.craftconnect.craftconnectmono.app.taskrequests.service;

import com.craftconnect.craftconnectmono.app.taskrequests.repository.TaskRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskRequestService {
    private final TaskRequestRepository taskRequestRepository;
} 