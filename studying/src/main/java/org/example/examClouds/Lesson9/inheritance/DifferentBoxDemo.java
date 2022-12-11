package org.example.examClouds.Lesson9.inheritance;

public class DifferentBoxDemo {
    public static void main(String[] args) {
        Box6 box = new Box6(15, 10, 25);
        HeavyBox heavyBox = new HeavyBox(15, 10, 20, 5);
        ColorBox colorBox = new ColorBox(25, 12, 20, "red");

        System.out.println("Box capacity: " + box.getCapacity());
        System.out.println("Box capacity: " + heavyBox.getCapacity()
                + " Box weight: " + heavyBox.weight);
        System.out.println("Box capacity: " + colorBox.getCapacity()
                + " Box color: " + colorBox.color);
    }
}
