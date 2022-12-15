package org.example.examClouds.Lesson11.interfaceIntroduction.cargo;

public class Pickup implements CargoAuto, PassengersAuto {
    public void transportCargo() {
        System.out.println("Delivering cargo");
    }

    public void transportPassengers() {
        System.out.println("Delivering passengers");
    }
}