package org.example.reflection.secondWayToGetClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Class<? extends Car> carClass = car.getClass();
        System.out.println(car);
    }
}
