package org.example.oop.overview;

public class LaptopExample {
    String graphic = "rtx3050";
    String color = "black";
    String hz = "144";
    int point = 16;

    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }
}
