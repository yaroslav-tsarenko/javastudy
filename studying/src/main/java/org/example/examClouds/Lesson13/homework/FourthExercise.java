package org.example.examClouds.Lesson13.homework;

public class FourthExercise {
    public static void main(String[] args) {
        findMiddleOfWord("Hello");
    }

    public static void findMiddleOfWord(String words) {
        String s = words;
        int n = 2;
        if (words.length() % 2 != 0) {
            System.out.println(words.charAt(n));
        } else {
            System.out.println("" + s.charAt(n - 1) + s.charAt(n));
        }
    }
}
