package org.example.examClouds.Lesson11.enumerations.examples;

public class CoffeeSizeDemo7 {
    public static void main(String[] args) {
        for (CoffeeSize4 coffeeSize : CoffeeSize4.values()) {
            System.out.println(coffeeSize + " " + coffeeSize.getLidCode());
        }
    }
}
