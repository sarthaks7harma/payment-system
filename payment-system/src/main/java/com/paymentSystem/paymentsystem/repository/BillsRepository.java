package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.Bills;

public interface BillsRepository extends JpaRepository<Bills, String>{

}
