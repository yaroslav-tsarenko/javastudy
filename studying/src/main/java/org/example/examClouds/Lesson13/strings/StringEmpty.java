package org.example.examClouds.Lesson13.strings;

public class StringEmpty {
    /**
     * Метод isEmpty() проверяет пустая ли строка. Возвращает true, только если длина строки равна 0.
     * Метод isBlank() возвращает true, если строка пуста или содержит только пробелы (Java 11).
     * @param
     */
    public static void main(String[] args) {
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
    }
}