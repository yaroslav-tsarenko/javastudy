package org.example.examClouds.Lesson13.homework;

import java.util.Formatter;

public class FifthExercise {
    public static void main(String[] args) {
        students("Ivan", 5, "Math");
        students("Maria", 4, "English");
        students("Michael", 3, "Biology");
    }

    public static void students(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Student %s get %s from %s", fullName, mark, subject);
        System.out.println(formatter);
    }
}
