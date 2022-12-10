package org.example.examClouds.Lesson7.SearchMethod.linearSearch;

import java.util.Scanner;

public class SearchMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        int[] arrayNumbers = new int[5];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number to search: ");
        int searchNumber = scanner.nextInt();
        linearSearch(arrayNumbers, searchNumber);

    }

    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}
