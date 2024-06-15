package com.example.fsmdemospringangular.repository;

import com.example.fsmdemospringangular.entities.Payment;
import com.example.fsmdemospringangular.entities.PaymentStatus;
import com.example.fsmdemospringangular.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    List<Payment> findByStudentCode(String code);
    List <Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);

}
