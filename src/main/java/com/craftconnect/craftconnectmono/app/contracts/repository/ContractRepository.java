package com.craftconnect.craftconnectmono.app.contracts.repository;

import com.craftconnect.craftconnectmono.app.contracts.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
} 