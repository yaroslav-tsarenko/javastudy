package org.example.owmProjects.databaseOfCars;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataBaseOfCars {
    public static void main(String[] args) {

        String userChoice = "yes";


        while (userChoice.equals("yes")) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Chose the index of car like a '0, 1, 2, 3, 4': ");

                int indexOfCar = scanner.nextInt();

                InformationAboutCars[] cars = new InformationAboutCars[10];

                cars[0] = new BMW("1.5", "Black", "10.000$", "BMW 328i");
                cars[1] = new MercedesBenz("2.5", "White", "15.000$", "Mercedes-Benz CLA");
                cars[2] = new Mitsubishi("3.0", "Yellow", "5.000$", "Mitsubishi Evolution");
                cars[3] = new Toyota("5.0", "Red", "50.000$", "Toyota Land Cruiser");
                cars[4] = new Volkswagen("4.0", "Grey", "27.000$", "Volkswagen Tiguan");


                for (int i = 0; i < cars.length; i++) {
                    if (indexOfCar == i) {
                        System.out.println(cars[i]);
                    }
                }
                System.out.println("If you want to continue, type 'yes'. " +
                        "If you want to exit, type 'no': ");
                userChoice = scanner.next();

            } catch (InputMismatchException ex) {
                System.err.println("Entered wrong symbol");
            }


        }

        Scanner addNewCar = new Scanner(System.in);
        System.out.println("Do you want add new car?: ");
        String scannerNewCar = addNewCar.next();

        if (scannerNewCar.equals("yes")) {

            ArrayList<String> newCar = new ArrayList<>();

            System.out.println("Write car model which you want to add: ");
            String NameOfCar = addNewCar.next();
            newCar.add(NameOfCar);


            System.out.println("Enter engine capacity of your car: ");
            String EngineCapacity = addNewCar.next();
            newCar.add(EngineCapacity);


            System.out.println("Enter color of your car: ");
            String Color = addNewCar.next();
            newCar.add(Color);


            System.out.println("Enter price of your car: ");
            String Price = addNewCar.next();
            newCar.add(Price);


            System.out.println("Enter model of car: ");
            String Model = addNewCar.next();
            newCar.add(Model);

            System.out.println("Name: " + NameOfCar + " Engine Capacity: " + EngineCapacity + " Color: " + Color + " Price: " + Price + " Model: " + NameOfCar + " " + Model);


        }
    }

    public void UserAddCar(){

    }
}


class AddNewCar extends InformationAboutCars{

    public AddNewCar(String engineCapacity, String color, String price, String model) {
        super(engineCapacity, color, price, model);
    }

}
