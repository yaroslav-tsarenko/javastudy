package org.example.leetCode;

import java.util.Arrays;

public class DivisionByTwo {
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Array which have numbers division by 2: ");
        divisionByTwo(array);
    }

    public static void divisionByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
