package com.craftconnect.craftconnectmono.app.users.service;

import com.craftconnect.craftconnectmono.app.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
} 