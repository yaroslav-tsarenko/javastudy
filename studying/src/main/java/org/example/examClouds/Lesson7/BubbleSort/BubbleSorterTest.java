package org.example.examClouds.Lesson7.BubbleSort;

import java.util.Arrays;

public class BubbleSorterTest {
    public static void main(String[] args) {
        int[][] data = {
                        {},
                        {1},
                        {0, 3, 2, 1},
                        {4, 3, 2, 1, 0},
                        {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}