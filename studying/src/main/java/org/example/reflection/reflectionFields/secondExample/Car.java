package org.example.reflection.reflectionFields.secondExample;

class Car {
    private int horsepower;
    public final String serialNumber;

    public Car() {
        serialNumber = "";
    }

    public Car(int horsepower, String serialNumber) {
        this.horsepower = horsepower;
        this.serialNumber = serialNumber;
    }
}