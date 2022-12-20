package org.example.examClouds.Lesson13.stringBuilder;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
