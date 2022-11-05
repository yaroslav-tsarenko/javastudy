package org.example.owmProjects.otherProject;

public class DataBaseOfCars {
    public static void main(String[] args) {

        String[] cars = new String[5];
        cars[0] = "Toyota";
        cars[1] = "Volkswagen";
        cars[2] = "BMW";
        cars[3] = "Mercedes-Benz";
        cars[4] = "Mitsubishi";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
