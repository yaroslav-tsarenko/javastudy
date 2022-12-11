package org.example.examClouds.Lesson9.inheritance;

public class DifferentBoxDemo2 {
    public static void main(String[] args) {
        Box6 box = new Box6(15, 10, 25);
        Box6 heavyBox = new HeavyBox(15, 10, 20, 5);
        ColorBox redBox = new ColorBox(25, 12, 20, "red");
        ColorBox blueBox = new ColorBox(25, 12, 20, "blue");

        System.out.println("Box width: " + box.width);
        System.out.println("Heavy box width: " + heavyBox.width);
        System.out.println("Red box width: " + redBox.width);
        System.out.println("Blue box width: " + blueBox.width);
        System.out.println("Blue box color: " + blueBox.color);
        System.out.println("Red box color: " + redBox.color);

    }
}