package org.example.examClouds.Lesson16.homework;

import java.util.function.Supplier;

public class RandomNumberFromOneToTen {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        System.out.println(supplier.get());
    }
}
