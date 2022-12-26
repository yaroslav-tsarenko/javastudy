package org.example.examClouds.Lesson17.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> uo = s -> s.toUpperCase();
        System.out.print(uo.apply("Java 8"));
    }
}
