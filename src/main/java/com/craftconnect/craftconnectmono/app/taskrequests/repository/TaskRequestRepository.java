package com.craftconnect.craftconnectmono.app.taskrequests.repository;

import com.craftconnect.craftconnectmono.app.taskrequests.entity.TaskRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRequestRepository extends JpaRepository<TaskRequest, Long> {
} 