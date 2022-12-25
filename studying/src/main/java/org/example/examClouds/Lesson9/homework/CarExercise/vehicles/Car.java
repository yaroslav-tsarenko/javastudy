package org.example.examClouds.Lesson9.homework.CarExercise.vehicles;

import org.example.examClouds.Lesson9.homework.CarExercise.details.Engine;
import org.example.examClouds.Lesson9.homework.CarExercise.professions.Driver;

public class Car {
    private String modelOfCar;
    private String classOfCar;
    private Driver driver;
    private Engine engine;

    public Car(String modelOfCar, String classOfCar, Driver driver, Engine engine) {
        this.modelOfCar = modelOfCar;
        this.classOfCar = classOfCar;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnLeft() {
        System.out.println("Turning left...");
    }

    public void turnRight() {
        System.out.println("Turning right...");
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Object getType() {
        return null;
    }

    public boolean getCost() {
        return false;
    }
}
