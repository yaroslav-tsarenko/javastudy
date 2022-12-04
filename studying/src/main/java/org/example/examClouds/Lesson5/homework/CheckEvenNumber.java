package org.example.examClouds.Lesson5.homework;

import java.util.Scanner;

public class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner userInputNumber = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = userInputNumber.nextInt();
        if (number % 2 == 0){
            System.out.println("The number: " + number + " is even");
        }else {
            System.err.println("Number is not even");
            System.exit(0);
        }

    }
}
