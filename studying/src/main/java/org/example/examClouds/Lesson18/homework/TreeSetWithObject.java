package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.inheritance.HeavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithObject {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(3, 5, 7, 9);
        HeavyBox heavyBox2 = new HeavyBox(5, 7, 9, 11);
        HeavyBox heavyBox3 = new HeavyBox(7, 9, 11, 13);
        HeavyBox heavyBox4 = new HeavyBox(4, 5, 7, 10);

        SortedSet<Object> objects = new TreeSet<>();

        objects.add(heavyBox1);
        objects.add(heavyBox2);
        objects.add(heavyBox3);
        objects.add(heavyBox4);


        for (Object name: objects) {
            System.out.println(name);
        }


    }
}
