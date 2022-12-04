package org.example.examClouds.Lesson5.homework;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 0 to 10: ");
        int userInput = scanner.nextInt();
        if (userInput > 0 && userInput < 10) {
            System.out.println("Number is less than 10 or 0");
        }
        if (userInput == 10) {
            System.out.println("The number is equals 10");
        } else if (userInput == 0) {
            System.out.println("The number is equals 0");
        } else {
            System.out.println("Positive number greater than 10 or negative");
        }
    }
}
