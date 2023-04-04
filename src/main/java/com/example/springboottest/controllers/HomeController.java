package com.example.springboottest.controllers;

import com.example.springboottest.db.Car;
import com.example.springboottest.db.DBManager;
import com.example.springboottest.entities.CarCity;
import com.example.springboottest.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/")
    public String index(Model model){
        List<CarCity> cars = carService.getAllCars();
        model.addAttribute("kolik", cars);
        return "index";
    }


    @PostMapping(value = "/addcar")
    public String addCar(@RequestParam(name = "car_name", defaultValue = "EMPTY") String name,
                         @RequestParam(name = "car_years", defaultValue = "0") int year,
                         @RequestParam(name = "car_country", defaultValue = "CITY") String country,
                         @RequestParam(name = "car_price", defaultValue = "0") int price){
        carService.addCar(new CarCity(null, name, year, country, price));
        return "redirect:/";

    }

    @GetMapping(value = "/details/{idsh}")
    public String details(Model model, @PathVariable(name = "idsh" ) Long id){
        CarCity car = carService.getCar(id);
        model.addAttribute("car", car);
        return "details";
    }


    @PostMapping(value = "/savecar")
    public String saveCar(@RequestParam(name = "car_id", defaultValue = "0") Long id,
                          @RequestParam(name = "car_name", defaultValue = "EMPTY") String name,
                         @RequestParam(name = "car_years", defaultValue = "0") int year,
                         @RequestParam(name = "car_country", defaultValue = "CITY") String country,
                         @RequestParam(name = "car_price", defaultValue = "0") int price){
        CarCity car = carService.getCar(id);
        if (car!=null){
            car.setName(name);
            car.setYear(year);
            car.setCountry(country);
            car.setPrice(price);
            carService.saveCar(car);
        }
        return "redirect:/";
    }

    @PostMapping(value = "/deletecar")
    public String deleteCar(@RequestParam(name = "car_id", defaultValue = "0") Long id){
        CarCity car = carService.getCar(id);
        if (car!=null){
            carService.deleteCar(car);
        }
        return "redirect:/";
    }


    }
