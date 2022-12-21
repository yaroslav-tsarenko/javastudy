package org.example.examClouds.Lesson13.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EleventhExercise {
    public static void main(String[] args) {
        int count = 1;
        String regex = "[A-Za-z]+";
        String s = "One two three раз два три one1 two2 123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(s.substring(matcher.start(), matcher.end()));
            int a = count++;
            System.out.println(a);
        }
    }
}
