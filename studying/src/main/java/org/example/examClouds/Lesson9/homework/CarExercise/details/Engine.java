package org.example.examClouds.Lesson9.homework.CarExercise.details;

public class Engine {
    private int engineCapacity;
    private String manufacturer;

    public Engine(int engineCapacity, String manufacturer) {
        this.engineCapacity = engineCapacity;
        this.manufacturer = manufacturer;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
