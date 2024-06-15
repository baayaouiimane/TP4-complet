package com.example.fsmdemospringangular.dtos;

import com.example.fsmdemospringangular.entities.PaymentStatus;
import com.example.fsmdemospringangular.entities.PaymentType;
import com.example.fsmdemospringangular.entities.Student;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}