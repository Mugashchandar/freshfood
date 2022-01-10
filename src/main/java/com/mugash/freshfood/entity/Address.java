package com.mugash.freshfood.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="door_no")
    private int doorNumber;

    private String street;
    private String area;
    private String town;
    private String city;
    private int pincode;

    @OneToOne(mappedBy = "address")
    @JsonManagedReference
    private User user;

}
