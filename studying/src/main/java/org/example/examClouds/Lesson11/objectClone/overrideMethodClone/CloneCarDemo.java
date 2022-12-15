package org.example.examClouds.Lesson11.objectClone.overrideMethodClone;

public class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Lorry", new Driver("Vasiliy", 45));
        Car clonedCar = car.clone();
        System.out.println("Original:\t" + car);
        System.out.println("Clone:   \t" + clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Vasya");

        System.out.println("Original after changes:\t" + car);
        System.out.println("Clone after changes driver's name:\t\t" + clonedCarDriver);
    }

}
