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
@Table(name="User")

public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   int id;
   String name;
   String PhoneNumber;
   String password;

   @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
   List<Reservation> reservationList = new ArrayList<>();
}
