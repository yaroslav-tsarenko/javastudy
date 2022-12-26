package org.example.examClouds.Lesson17.consumer;

import java.util.function.BiFunction;
import java.util.function.Consumer;

class Test {
    Test() {
        System.out.println("Hello world!!!");
    }

    public static void main(String[] args) {
        Runnable r = Test::new;
    }
}