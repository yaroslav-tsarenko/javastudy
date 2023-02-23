package org.example.leetCode;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int avg = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 50) + 2);
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }

            avg += array[i] / array.length;
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Average number: " + avg);
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}
