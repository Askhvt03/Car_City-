package com.example.springboottest.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1L, "w210", "Germany", 3000000));
        cars.add(new Car(2L, "camry 30", "Japan", 5000000));
        cars.add(new Car(3L, "kia k5", "Korea", 10000000));
        cars.add(new Car(4L, "ln 200", "Japan", 16000000));
    }

    private static Long id = 5L;

    public static ArrayList<Car> getCars(){
        return cars;
    }

    public static  void addCar(Car car){
        car.setId(id);
        cars.add(car);
        id++;
    }
    
    public static Car getCar(Long id){
        for (Car cr: cars) {
            if (cr.getId()==id) return cr;
        }
        return null;
    }
}
