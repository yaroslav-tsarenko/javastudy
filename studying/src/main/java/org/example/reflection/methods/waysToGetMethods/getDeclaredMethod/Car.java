package org.example.reflection.methods.waysToGetMethods.getDeclaredMethod;

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

    public int getHorsepower() {
        return horsepower;
    }

    void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    protected void printSerialNumber() {
        System.out.println(serialNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
