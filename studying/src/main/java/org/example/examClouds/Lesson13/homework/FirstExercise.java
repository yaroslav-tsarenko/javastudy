package org.example.examClouds.Lesson13.homework;

public class FirstExercise {
    public static void main(String[] args) {
        String a = "Boom";
        String b = "I like java!!!";
        String c = "My friends told me that, i'm professional java developer!!!";
        checkingMethod(a);
        checkingMethod(b);
        checkingMethod(c);

    }

    public static void checkingMethod(String words){
        System.out.println(getLastN(words));
        System.out.println(words.endsWith("!!!"));
        System.out.println(words.startsWith("I like"));
        System.out.println(words.contains("Java"));
        System.out.println(words.indexOf("J"));
        System.out.println(words.replace("a", "o"));
        System.out.println(words.toLowerCase());
        System.out.println(words.toUpperCase());
        try {
            System.out.println(words.substring(7, 11));
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("Substring goes from range");
        }
    }

    public static String getLastN(String s){
        int n = 1;
        if (s == null || n > s.length()) {
            return s;
        }
        return s.substring(s.length() - n);
    }
}
