package org.example.examClouds.Lesson9.homework.CarExercise.vehicles;

import org.example.examClouds.Lesson9.homework.CarExercise.details.Engine;
import org.example.examClouds.Lesson9.homework.CarExercise.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String modelOfCar, String classOfCar, Driver driver, Engine engine, int maxSpeed) {
        super(modelOfCar, classOfCar, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
