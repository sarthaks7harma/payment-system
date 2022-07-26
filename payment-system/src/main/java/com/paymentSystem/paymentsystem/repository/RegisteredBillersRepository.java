package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.RegisteredBillers;

public interface RegisteredBillersRepository extends JpaRepository<RegisteredBillers, String>{

}
