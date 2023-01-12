package org.example.examClouds.Lesson22.shallowCopying;

public class Car2 implements Cloneable {
    /**
     * Конструктор копирования с поверхностным клонированием
     */
    private String name;
    private Driver driver;

    public Car2(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    /**
     * Конструктор копирования.
     *
     * @param otherCar
     */
    public Car2(Car otherCar) {
        this(otherCar.getName(), otherCar.getDriver());
    }

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
}