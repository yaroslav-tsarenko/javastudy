package org.example.examClouds.Lesson13.regularExpression;

import java.util.Arrays;

public class RegexDemo6 {
    public static void main(String[] args) {
        String str = "java5tiger 77 java6mustang";
        String[] words = str.split("\\d+\\s?");
        System.out.print(Arrays.toString(words));
    }
}
