package org.example.oop.abstraction;

public class Car {
    String color;
    String form;
    String id;
    double engineV;
    double fuelConsumption;
    double fuelInTank;

    Car(){
        fuelInTank = 0;
        id = "BB001";
    }

    Car(String color, String form, double engineV,
        double fuelConsumption, String id, double fuelInTank){
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
    }
//fuel car
    void fillTank(int fuelV){
        fuelInTank = fuelInTank + fuelV;
    }
//distance
    void drive(double distance){
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

}
