package com.craftconnect.craftconnectmono.app.contracts.service;

import com.craftconnect.craftconnectmono.app.contracts.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
} 