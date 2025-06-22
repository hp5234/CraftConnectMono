package com.craftconnect.craftconnectmono.app.users.repository;

import com.craftconnect.craftconnectmono.app.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
} 