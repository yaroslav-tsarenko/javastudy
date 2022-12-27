package org.example.examClouds.Lesson16.homework;

import org.example.examClouds.Lesson9.constructor.Phone;

import java.util.function.Consumer;

public class ConsumerSeller {
    public static void main(String[] args) {
        Consumer<Phone> consumer1 = phone -> System.out.println("Sold phone " + phone);

        consumer1.accept(new Phone("067549", "Iphone", 9));


    }
}
