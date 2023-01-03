package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.inheritance.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class HeavyBoxWithQueue {
    public static void main(String[] args) {

        HeavyBox heavyBox1 = new HeavyBox(3, 5, 7, 9);
        HeavyBox heavyBox2 = new HeavyBox(5, 7, 9, 11);
        HeavyBox heavyBox3 = new HeavyBox(7, 9, 11, 13);
        HeavyBox heavyBox4 = new HeavyBox(4, 5, 7, 10);

        Deque<Object> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(heavyBox1);
        heavyBoxes.offer(heavyBox2);
        heavyBoxes.offer(heavyBox3);
        heavyBoxes.offer(heavyBox4);

        System.out.println("Before polling");

        for (Object boxes : heavyBoxes) {
            System.out.println(boxes);
        }

        heavyBoxes.poll();
        heavyBoxes.poll();
        heavyBoxes.poll();
        heavyBoxes.poll();
        System.out.println("After polling: ");

        for (Object boxes : heavyBoxes) {
            System.out.println(boxes);
        }



    }
}
