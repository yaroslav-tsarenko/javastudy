package org.example.owmProjects.databaseOfCars.service;

import org.example.owmProjects.databaseOfCars.model.Car;

public class CarPrinterService {

    public void print(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.toString().replace("${index}", String.valueOf(i)));
        }
    }

    public void print(Car car, int index) {
        System.out.println(car.toString().replace("${index}", String.valueOf(index)));
    }
}

