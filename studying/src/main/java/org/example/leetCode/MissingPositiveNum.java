package org.example.leetCode;

import java.util.Arrays;

public class MissingPositiveNum {
    public static void main(String[] args) {
        int[] arrayForEqual = {2, 3, 4, 7, 11};
        // findKthPositive(arrayForEqual, 5);
        findKthPositive(arrayForEqual, 5);
    }

    public static void findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k){
                k++;
            }else {
                break;
            }
        }
        System.out.println(k);
    }


    public static int[] findMissingNumbers(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        int[] missingNumbers = new int[max - min - arr.length + 1];
        int idx = 0;
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers[idx++] = i;
            }
        }
        return Arrays.copyOf(missingNumbers, idx);
    }
}
