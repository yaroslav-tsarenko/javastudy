package org.example.examClouds.Lesson13.strings;

public class StringDemo2 {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, 68, 69, 70}; //табличка unicode

        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(bytes, 2, 3);
        System.out.println(s2);
    }
}
