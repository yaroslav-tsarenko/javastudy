package org.example.examClouds.Lesson13.formatter;

public class FormatterDemo2 {
    public static void main(String[] args) {
        System.out.printf("%,.2f%n", 10000.0 / 3.0);
        System.out.printf("%, (.2f%n", -10000.0 / 3.0);
        System.out.printf("%09.2f%n", 10000.0 / 3.0);
    }
}
