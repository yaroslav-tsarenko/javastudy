package org.example.oop.abstraction.edu.hillel.oop.intro.subpack;

public class Car {
    private String color;
    private String form;
    private String id;
    private double engineV;
    private double fuelConsumption;
    double fuelInTank;

    public Car(){
        fuelInTank = 0;
        id = "BB001";
    }

    public Car(String color, String form, double engineV,
        double fuelConsumption, String id, double fuelInTank){
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
    }
//fuel car
    public void fillTank(int fuelV){
        fuelInTank = fuelInTank + fuelV;
    }
//distance
    public void drive(double distance){
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

    public double getFuelInTank(){
        return fuelInTank;
    }

    public void setColor(String value){
        if (value.compareTo("red") != 0)
        color = value;

    }

}
