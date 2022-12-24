package org.example.examClouds.Lesson16.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinMax {
    private int[] array;

    public MinMax(int[] array) {
        this.array = array;
    }

    public void minNumWithArraySort() {
        int[] mass = array.clone();
        Arrays.sort(mass);
        System.out.println(mass[0]);
    }

    public void minNum(){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println(min);
    }

    public void maxNum() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }

}
