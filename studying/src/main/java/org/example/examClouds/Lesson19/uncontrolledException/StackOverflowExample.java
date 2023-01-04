package org.example.examClouds.Lesson19.uncontrolledException;

public class StackOverflowExample {
    public static void main(String[] args) {
        System.out.println("1");
        main(args);
    }
}
