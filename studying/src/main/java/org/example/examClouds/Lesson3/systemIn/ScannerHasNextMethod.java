package org.example.examClouds.Lesson3.systemIn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHasNextMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter whole number: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("You entered not whole number");
        }
    }
}

class ScannerDoubleMethod{
    public static void main(String[] args) {
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number: ");
                double userInput = scanner.nextDouble();
                System.out.println(userInput);
                if (userInput == scanner.nextDouble()){
                    break;
                }
                // если ввести букву s,
                // то случится ошибка во время исполнения
            }catch (InputMismatchException e){
                System.err.println("Enter number not a word");
            }
        }
    }
}

class ScannerNextLineMethod{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter something again: ");
        scanner1.nextLine();
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner1.nextLine();
        System.out.println(s1 + s2);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double i1 = sc.nextDouble();
            double i2 = sc.nextDouble();
            System.out.println(i1 + i2);
        }
    }
}
