package org.example.examClouds.Lesson4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        while (true) {
            Scanner scannerNumber = new Scanner(System.in);
            System.out.println("Enter whole number: ");
            int userInput = scannerNumber.nextInt();
            if (userInput % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is not even");
            }
        }
    }
}

class SecondExercise {
    public static void main(String[] args) throws InterruptedException {
        SecondExercise secondExercise = new SecondExercise();
        secondExercise.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        System.out.println(a + " " + b + " " + c);

        double tmp = Math.min(a,b);
        double min = Math.min(tmp, c);

        System.out.println("Min number with module:\n" + min);

    }
}
