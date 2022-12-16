package org.example.examClouds.Lesson11.referenceCasting;

import org.example.examClouds.Lesson9.inheritance.Box6;
import org.example.examClouds.Lesson9.inheritance.ColorBox;

public class CastingDemo {
    public static void main(String[] args) {
        Box6 box1 = new HeavyBox1();
        // System.out.println(box1.weight);

        HeavyBox1 heavyBox1 = (HeavyBox1) box1;
        System.out.println("Вес: " + heavyBox1.weight);

        Box6 box2 = new ColorBox();
        HeavyBox1 heavyBox2 = (HeavyBox1) box2; //ClassCastException

        Box6 box3 = new Box6();
        HeavyBox1 heavyBox3 = (HeavyBox1) box3; //ClassCastException
    }
}