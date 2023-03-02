package org.example.leetCode;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nonSortedArray = {3, 5, 1, 6, 8, 21, 7, 10};
        bubbleSort(nonSortedArray);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
