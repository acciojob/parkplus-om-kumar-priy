package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="Reservation")


public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int numberOfHours;
   // User user;
    //Spot spot;
  //  Payment payment;

    @OneToOne(mappedBy = "reservation",cascade = CascadeType.ALL)
    Payment payment;

    @ManyToOne
    @JoinColumn
    Spot spot;

    @ManyToOne
    @JoinColumn
    User user;
}
