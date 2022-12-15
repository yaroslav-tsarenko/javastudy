package org.example.examClouds.Lesson11.objectClone.shallowCoping;

import org.example.examClouds.Lesson11.objectClone.overrideMethodClone.Driver;

public class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    /**
     * Конструктор копирования.
     *
     * <li> otherCar
     */
   /* public Car(Car otherCar) {
        this(otherCar.getName(), otherCar.getDriver());
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public Car(Car otherCar) throws CloneNotSupportedException {
        this(otherCar.getName(), otherCar.getDriver().clone());
    }
    /**
     * Constructor with deep clone
     */
}