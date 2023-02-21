package org.example.leetCode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 3};
        int[] arr2 = {7, 2, 14, 5};
        int[] arr3 = {3, 1, 7, 11};
        checkIfExist2(arr2);
    }

    public static boolean checkIfExist(int[] array) {
        boolean t = Boolean.parseBoolean(null);
        int j = 2;
        for (int i = 0; i < array.length; i++) {
            int element = array[j] * j;
            if (array[i] == element) {
                t = true;
                System.out.println(t);
                break;
            } else {
                t = false;
                System.out.println(t);
            }
        }
        return t;
    }

    public static boolean checkIfExist2(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }

        return false;
    }
}
