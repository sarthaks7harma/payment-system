package com.paymentSystem.paymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentSystem.paymentsystem.dto.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

}
