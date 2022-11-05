package org.example.scanner;

import java.util.Scanner;

public class ExampleOfScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

    }
}
