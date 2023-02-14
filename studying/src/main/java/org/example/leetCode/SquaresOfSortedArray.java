package org.example.leetCode;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] array = {-4, -1, 0, 3, 10};
        SquaresOfSortedArray test = new SquaresOfSortedArray();
        int[] ints = test.sortedSquareArray(array);
        System.out.println(Arrays.toString(ints));

    }

    public int[] sortedSquareArray(int[] array) {

        int[] staticArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            staticArray[i] = array[i] * array[i];
        }

        Arrays.sort(staticArray);
        return staticArray;
    }
}
