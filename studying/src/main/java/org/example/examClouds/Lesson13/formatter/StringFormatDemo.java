package org.example.examClouds.Lesson13.formatter;

public class StringFormatDemo {
    public static void main(String[] args) {
        String str = String.format("Строка c форматированием: %16.2f", 1000.0 / 3.0);
        System.out.println(str);
    }
}
