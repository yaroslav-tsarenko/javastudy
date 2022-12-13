package org.example.examClouds.Lesson9.homework.CarExercise.vehicles;

import org.example.examClouds.Lesson9.homework.CarExercise.details.Engine;
import org.example.examClouds.Lesson9.homework.CarExercise.professions.Driver;

public class Lorry extends Car{
    private int weightCapacity;

    public Lorry(String modelOfCar, String classOfCar, Driver driver, Engine engine, int weightCapacity) {
        super(modelOfCar, classOfCar, driver, engine);
        this.weightCapacity = weightCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
