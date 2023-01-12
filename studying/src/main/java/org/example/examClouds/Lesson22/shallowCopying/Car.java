package org.example.examClouds.Lesson22.shallowCopying;

public class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
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

   /* @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }*/


    @Override
    public Car clone() throws CloneNotSupportedException { // -> deep cloning
        Car newCar = (Car) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }
}
