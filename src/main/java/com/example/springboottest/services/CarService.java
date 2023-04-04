package com.example.springboottest.services;

import com.example.springboottest.entities.CarCity;

import java.util.List;

public interface CarService {

    CarCity addCar(CarCity carCity);
    List<CarCity> getAllCars();
    CarCity getCar(Long id);
    void deleteCar(CarCity carCity);
    CarCity saveCar(CarCity carCity);
}
