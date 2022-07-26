package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, String>{

}
