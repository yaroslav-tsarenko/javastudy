package org.example.examClouds.Lesson11.referenceCasting;

import org.example.examClouds.Lesson9.inheritance.Box6;
import org.example.examClouds.Lesson9.inheritance.ColorBox;

public class CastingDemo2 {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        if (box1 instanceof HeavyBox1) {
            System.out.println("Reference 1");
        }
        if (box1 instanceof Box6) {
            System.out.println("Reference 2");
        }
        if (box1 instanceof Object) {
            System.out.println("Reference 3");
        }

        Box6 box2 = new ColorBox();
        if (box2 instanceof HeavyBox1) {
            System.out.println("Reference 4");
        }

        Box6 box3 = new Box6();
        if (box3 instanceof HeavyBox1) {
            System.out.println("Приведение 5");
        }
    }
}
