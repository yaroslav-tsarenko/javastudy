package org.example.examClouds.Lesson4.homework;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        while (true){
            Scanner scannerNumber = new Scanner(System.in);
            System.out.println("Enter whole number: ");
            int userInput = scannerNumber.nextInt();
            if (userInput % 2 == 0){
                System.out.println("number is even");
            }else {
                System.out.println("number is not even");
            }
        }
    }
}
