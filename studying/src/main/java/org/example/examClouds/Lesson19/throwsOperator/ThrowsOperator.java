package org.example.examClouds.Lesson19.throwsOperator;

public class ThrowsOperator {
    public static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Выброс " + e);
        }
    }
}
