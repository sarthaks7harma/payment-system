package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.MasterBiller;

public interface MasterBillerRepository extends JpaRepository<MasterBiller, String>{

}
