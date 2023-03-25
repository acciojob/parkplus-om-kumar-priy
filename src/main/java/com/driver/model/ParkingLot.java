package com.driver.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name="ParkingLot")

public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private  String address;

    @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    List<Spot> spotList = new ArrayList<>();

        public List<Spot> getSpotList() {
            return spotList;
        }

        public void setSpotList(List<Spot> spotList) {
            this.spotList = spotList;
        }
    }

