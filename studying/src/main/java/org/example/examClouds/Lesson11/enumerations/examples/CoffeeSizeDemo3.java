package org.example.examClouds.Lesson11.enumerations.examples;

public class CoffeeSizeDemo3 {
    public static void main(String[] args) {
        String coffeeSize = String.valueOf(CoffeeSize.valueOf("BIG"));
        System.out.println("Переменная coffeeSize содержит " + coffeeSize);
    }
}
