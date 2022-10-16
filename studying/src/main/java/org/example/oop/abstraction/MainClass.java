package org.example.oop.abstraction;

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fuelInTank = 10;
        Car myWifeCar = new Car("pink", "sedan", 1.8, 6, "PINKY", 10);
        Human h1 = new Human("Jack");
        Human h2 = new Human("Jane");
        myCar.fillTank(50);
        System.out.println("Current fuel level = " + myCar.getFuelInTank());


        myCar.setColor("Orange"); //getter and setter
    }
}
