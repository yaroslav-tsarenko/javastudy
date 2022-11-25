package org.example.reflection.methods.getFields;

class Car {
    private int horsepower;
    public final String serialNumber;
    public String color;

    public Car() {
        serialNumber = "";
        color = "black";
    }

    public Car(int horsepower, String serialNumber, String color) {
        this.horsepower = horsepower;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    protected void printSerialNumber() {
        System.out.println(serialNumber);
    }
}
