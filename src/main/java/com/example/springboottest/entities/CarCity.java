package com.example.springboottest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car_city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarCity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "car_name")
    private String name;

    @Column(name = "car_year")
    private int year;

    @Column(name = "country")
    private String country;

    @Column(name = "price")
    private int price;



}
