package org.example.examClouds.Lesson11.enumerations.examples;

class CoffeeSizeValuesDemo {
    public static void main(String[] args) {
        System.out.println("Константы перечислимого типа CoffeeSize:");
        CoffeeSize[] coffeeSizes;
        coffeeSizes = CoffeeSize.values();
        for (CoffeeSize c : coffeeSizes) {
            System.out.println(c);
        }
    }
}
