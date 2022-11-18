package org.example.owmProjects.databaseOfCars.service;

import org.example.owmProjects.databaseOfCars.model.Car;

public class CarStorageService {

    private Car[] cars = new Car[5];

    public CarStorageService() {
        initStorage();
    }

    public void initStorage() {

        cars[0] = new Car("1.5", "Black", "10.000$", "BMW", "1");
        cars[1] = new Car("2.5", "White", "15.000$", "Mercedes-Benz", "2");
        cars[2] = new Car("3.0", "Yellow", "5.000$", "Mitsubishi", "3");
        cars[3] = new Car("5.0", "Red", "50.000$", "Toyota Land", "5");
        cars[4] = new Car("4.0", "Grey", "27.000$", "Volkswagen", "6");

    }

    public void addNewCar(Car car) {
        Car[] newCars = new Car[cars.length + 1];
        for (int i = 0; i < newCars.length; i++) {
            if (i < cars.length) {
                newCars[i] = cars[i];
            } else {
                newCars[i] = car;
            }
        }
        cars = newCars;
    }

    public void removeCar(int index) {
        Car[] newCars = new Car[cars.length - 1];
        for (int i = 0, j = 0; i < newCars.length; i++, j++) {
            if (j != index) {
                newCars[i] = cars[j];
            }else{
                i = i - 1;
            }
        }
        cars = newCars;
    }

    public Car[] getCars() {
        return cars;
    }
}