package org.example.examClouds.Lesson16.homework;

import org.example.examClouds.Lesson9.superMethod.C;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 50, 60, 70, 2, 1, 6, 99};
        MinMax minMax = new MinMax(array);
        minMax.maxNum();
        minMax.minNum();
        minMax.minNumWithArraySort();
    }
}
