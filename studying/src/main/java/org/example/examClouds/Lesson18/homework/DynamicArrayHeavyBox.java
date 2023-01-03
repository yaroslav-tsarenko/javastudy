package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.inheritance.HeavyBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class DynamicArrayHeavyBox {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(3, 5, 7, 9);
        HeavyBox heavyBox2 = new HeavyBox(5, 7, 9, 11);
        HeavyBox heavyBox3 = new HeavyBox(7, 9, 11, 13);
        HeavyBox heavyBox4 = new HeavyBox(4, 5, 7, 10);

        List<Object> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);

        System.out.println();
        System.out.println("Before remove: ");

        for (Object boxes : heavyBoxes) {
            System.out.println(boxes);
        }

        System.out.println();
        System.out.println("After changing weight of first box: ");
        heavyBoxes.remove(0);
        heavyBoxes.add(heavyBox4);

        for (Object boxes : heavyBoxes) {
            System.out.println(boxes);
        }

        System.out.println();
        System.out.println("After remove: ");
        heavyBoxes.remove(1);

        for (Object boxes : heavyBoxes) {
            System.out.println(boxes);
        }

        System.out.println();
        System.out.println("Collection after clearing: ");
        heavyBoxes.clear();



    }
}
