package org.example.examClouds.Lesson19.uncontrolledException;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        method(new int[0]);
    }

    private static void method(Object arg) {
        String x = (String) arg;
    }
}
