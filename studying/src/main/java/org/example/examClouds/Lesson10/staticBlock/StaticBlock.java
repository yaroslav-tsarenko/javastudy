package org.example.examClouds.Lesson10.staticBlock;

import java.util.Scanner;

public class StaticBlock {

    static String a;

    static {
        System.out.println("Static block initialized.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        a = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}