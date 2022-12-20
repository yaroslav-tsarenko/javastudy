package org.example.examClouds.Lesson13.stringBuilder;

public class Teest {
    public static void stringReplace(String text) {
        text = text.replace('j', 'c');
    }

    public static void builderReplace(StringBuilder text) {
        text = text.append("c");
    }

    public static void main(String[] args) {
        String textString = "java";
        StringBuilder textBuffer = new StringBuilder("java");
        stringReplace(textString);
        builderReplace(textBuffer);
        System.out.println(textString + textBuffer);
    }
}
