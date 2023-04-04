package com.example.springboottest.services.impl;

import com.example.springboottest.entities.CarCity;
import com.example.springboottest.repositories.CarCityRepository;
import com.example.springboottest.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarCityRepository carCityRepository;

    @Override
    public CarCity addCar(CarCity carCity) {
        return carCityRepository.save(carCity);
    }

    @Override
    public List<CarCity> getAllCars() {
        return carCityRepository.findAll();
    }

    @Override
    public CarCity getCar(Long id) {
        return carCityRepository.findByIdAndPriceGreaterThan(id, 0);
    }

    @Override
    public void deleteCar(CarCity carCity) {
        carCityRepository.delete(carCity);
    }

    @Override
    public CarCity saveCar(CarCity carCity) {
        return carCityRepository.save(carCity);
    }
}
