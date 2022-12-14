package org.example.examClouds.Lesson10.staticVariable;

public class Ball {
    static int count = 0;
    String color = "none";

    public Ball(String color) {
        this.color = color;
        count++;
    }
}
