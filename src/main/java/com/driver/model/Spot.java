package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="Spot")


public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    private SpotType spotType;
   private int pricePerHour;
    private Boolean occupied;
    //ParkingLot parkinlot;

    @OneToMany(mappedBy = "spot",cascade = CascadeType.ALL)
    List<Reservation> reservationList = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    ParkingLot parkingLot;
}
