package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="Payment")

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Boolean paymentCompleted;
    @Enumerated(EnumType.STRING)
    PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    Reservation reservation;

}
