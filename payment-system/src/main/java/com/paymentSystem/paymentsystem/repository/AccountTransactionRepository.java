package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.AccountTransaction;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, String> {

}
