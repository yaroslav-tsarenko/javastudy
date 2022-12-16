package org.example.examClouds.Lesson11.enumerations.examples;

public class CoffeeSizeCompareTo {
    public static void main(String[] args) {
        String bigCup = String.valueOf(CoffeeSize.BIG);
        String hugeCup = String.valueOf(CoffeeSize.HUGE);
        String anotherBigCup = String.valueOf(CoffeeSize.BIG);
        String overwhelmingCup = String.valueOf(CoffeeSize.OVERWHELMING);

        System.out.println("bigCup.compareTo(hugeCup): " +  bigCup.compareTo(hugeCup));
        System.out.println("hugeCup.compareTo(bigCup): " + hugeCup.compareTo(bigCup));
        System.out.println("bigCup.compareTo(anotherBigCup): " + bigCup.compareTo(anotherBigCup));
        System.out.println("bigCup.compareTo(overwhelmingCup): " + bigCup.compareTo(overwhelmingCup));
    }
}
