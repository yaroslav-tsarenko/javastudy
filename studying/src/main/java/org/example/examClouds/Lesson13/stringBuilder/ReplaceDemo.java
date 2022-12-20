package org.example.examClouds.Lesson13.stringBuilder;

public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Этo простой тест.");
        stringBuilder.replace(4, 11, "был");
        System.out.println("После замены: " + stringBuilder);
    }
}
