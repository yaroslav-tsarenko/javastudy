package org.example.examClouds.Lesson13.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NinthExercise {
    public static void main(String[] args) {
        String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String patternString = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
