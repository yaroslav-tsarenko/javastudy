package org.example.exersices;

import java.util.Scanner;

public class ReplaceConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter text: ");
        String oldString = reader.nextLine();
        Scanner changeSymbol = new Scanner(System.in);
        System.out.println("Enter symbol what you want to change: ");
        String words1 = changeSymbol.nextLine();
        Scanner replaceSymbol = new Scanner(System.in);
        System.out.println("Enter symbol what you want to replace: ");
        String words2 = replaceSymbol.nextLine();
        String newString = oldString.replace(words1, words2);
        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);
    }
}
