package org.example.leetCode;

import java.util.Arrays;

public class DuplicateZerosThirdExample {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    private static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                // duplicate it!
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
