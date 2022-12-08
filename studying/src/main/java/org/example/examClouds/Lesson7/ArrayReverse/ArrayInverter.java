package org.example.examClouds.Lesson7.ArrayReverse;

public class ArrayInverter {
    public static void invert(int[] args) {
        int[] array = new int[]{};
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
    }
}
