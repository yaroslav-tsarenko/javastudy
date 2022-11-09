package org.example.exersices.Slack.AnotherExercise;

import java.util.Scanner;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter text: ");
        String words = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter how to change text (UPPERCASE = 1; LOWERCASE = 2): ");
        int userSelection = scanner2.nextInt();
        if (userSelection == 1) {
            System.out.println(words.toUpperCase());
        }else if (userSelection == 2) {
            System.out.println(words.toLowerCase());
        }else{
            System.out.println("Error command");
        }
    }
}
