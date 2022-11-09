package org.example.exersices.Slack.AnotherExercise;

import java.util.Objects;

public class Device {
    String Manufacturer;
    float Price;
    String SerialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        Manufacturer = manufacturer;
        Price = price;
        SerialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + Manufacturer +
                ", price = " + Price +
                ", serialNumber= " + SerialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device device)) return false;
        return Float.compare(device.Price, Price) == 0 && Objects.equals(Manufacturer, device.Manufacturer) && Objects.equals(SerialNumber, device.SerialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Manufacturer, Price, SerialNumber);
    }
}

class Monitor {

    String Manufacturer;
    float Price;
    String SerialNumber;
    int ResolutionX;
    int ResolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY){
        Manufacturer = manufacturer;
        Price = price;
        SerialNumber = serialNumber;
        ResolutionX = resolutionX;
        ResolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer = " + Manufacturer +
                ", Price=" + Price +
                ", SerialNumber='" + SerialNumber + '\'' +
                ", ResolutionX = " + ResolutionX +
                ", ResolutionY = " + ResolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor monitor)) return false;
        return Float.compare(monitor.Price, Price) == 0 && ResolutionX == monitor.ResolutionX && ResolutionY == monitor.ResolutionY && Objects.equals(Manufacturer, monitor.Manufacturer) && Objects.equals(SerialNumber, monitor.SerialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Manufacturer, Price, SerialNumber, ResolutionX, ResolutionY);
    }
}
