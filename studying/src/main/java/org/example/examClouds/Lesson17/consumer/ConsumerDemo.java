package org.example.examClouds.Lesson17.consumer;

import org.example.examClouds.Lesson9.constructor.Phone;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Phone> consumer1 = phone -> System.out.println("Have sold phone " + phone);
        Consumer<Phone> consumer2 = phone -> System.out.println("Send phone " + phone);

        consumer1.andThen(consumer2).accept(new Phone("0670111", "IPhone", 12));
    }
}
