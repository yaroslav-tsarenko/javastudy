package org.example.owmProjects.databaseOfCars.model;

public class Car {
    private String engineCapacity;
    private String color;
    private String price;
    private String brand;
    private String model;


    @Override
    public String toString() {
        return "index = ${index}" + "," +
                " engineCapacity='" + engineCapacity + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model;
    }

    public Car() {

    }

    public Car(String engineCapacity, String color, String price, String brand, String model){
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.model = model;

    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

