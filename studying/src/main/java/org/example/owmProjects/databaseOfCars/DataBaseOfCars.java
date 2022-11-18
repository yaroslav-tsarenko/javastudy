package org.example.owmProjects.databaseOfCars;

import org.example.owmProjects.databaseOfCars.model.Car;
import org.example.owmProjects.databaseOfCars.service.CarPrinterService;
import org.example.owmProjects.databaseOfCars.service.CarStorageService;

import javax.naming.Name;
import java.util.*;

public class DataBaseOfCars {
    public static void main(String[] args) {

        String userChoice = "yes";
        CarStorageService storageService = new CarStorageService();
        CarPrinterService printer = new CarPrinterService();


        while (userChoice.equals("yes")) {

            try {

                printer.print(storageService.getCars());
                Scanner scanner = new Scanner(System.in);


                System.out.println("Chose the index of car like a '0, 1, 2, 3, 4': ");

                int indexOfCar = scanner.nextInt();


                for (int i = 0; i < storageService.getCars().length; i++) {
                    if (indexOfCar == i) {
                        printer.print(storageService.getCars()[i], i);
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
        String userChoiceAddCar = "yes";

        while (userChoiceAddCar.equals("yes")) {

            if (scannerNewCar.equals("yes")) {

                Car car = new Car();

                System.out.println("Write car brand which you want to add: ");
                String NameOfCar = addNewCar.next();
                car.setBrand(NameOfCar);


                System.out.println("Enter engine capacity of your car: ");
                String EngineCapacity = addNewCar.next();
                car.setEngineCapacity(EngineCapacity);


                System.out.println("Enter color of your car: ");
                String Color = addNewCar.next();
                car.setColor(Color);


                System.out.println("Enter price of your car: ");
                String Price = addNewCar.next();
                car.setPrice(Price);

                System.out.println("Enter model of car: ");
                String Model = addNewCar.next();
                car.setModel(Model);

                storageService.addNewCar(car);

            }

            printer.print(storageService.getCars());
            Scanner scanner = new Scanner(System.in);
            String deleteChoice = "yes";
            while (deleteChoice.equals("yes")) {
                System.out.println("If you want remove new car, type 'yes'. " +
                        "If you want to exit, type 'no': ");

                deleteChoice = scanner.next();
                if (deleteChoice.equals("yes")) {
                    System.out.println("Type index of car what you want to remove: ");
                    int removeCar = scanner.nextInt();
                    storageService.removeCar(removeCar);
                    printer.print(storageService.getCars());
                }
            }

            System.out.println("If you want add new car, type 'yes'. " +
                    "If you want to exit, type 'no': ");
            userChoiceAddCar = scanner.next();

        }

    }
}



