package com.rentalcar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentalcar.pojos.Payment;

public interface PaymentDao extends JpaRepository<Payment, Long> {

}
