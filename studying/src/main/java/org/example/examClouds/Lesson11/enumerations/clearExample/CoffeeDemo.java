package org.example.examClouds.Lesson11.enumerations.clearExample;

import org.example.examClouds.Lesson9.superMethod.C;

public class CoffeeDemo {
    public static void main(String[] args) {
        CoffeeSize[] coffeeSizes = CoffeeSize.values();
        printArray(coffeeSizes);
    }

    private static void printArray(CoffeeSize[] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            System.out.println(sizes[i].name());
        }
    }
}
