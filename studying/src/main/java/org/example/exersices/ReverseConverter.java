package org.example.exersices;

import java.util.Scanner;

public class ReverseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse: ");
        String words = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(words);
        builder.reverse();
        System.out.println(builder);


    }
}