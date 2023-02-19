package org.example.leetCode;

import java.util.Arrays;

public class DeletingWithIndex {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 2, 7, 8, 2, 4, 2 };
        int index = 2;

        a = remove(a, index);
        System.out.println(Arrays.toString(a));
    }
    private static int[] remove(int[] a, int index) {

        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        int[] result = new int[a.length - 1];

        System.arraycopy(a, 0, result, 0, index);
        System.arraycopy(a, index + 1, result, index, a.length - index - 1);

        return result;
    }


}
