package org.example.leetCode;

import java.util.Arrays;

public class InPlaceArrayOperations {
    public static void main(String[] args) {
        InPlaceArrayOperations test = new InPlaceArrayOperations();
        int[] arr = {3, 5, 6, 7, 8, 2, 1, 3};
        test.squareEven(arr, arr.length);
    }
    public int[] squareEven(int[] array, int length) {

        // Check for edge cases.
        if (array == null) {
            return null;
        }

        // Create a resultant Array which would hold the result.
        int result[] = new int[length];

        // Iterate through the original Array.
        for(int i = 0; i < length; i++) {

            // Get the element from slot i of the input Array.
            int element = array[i];

            // If the index is an even number, then we need to square element.
            if (i % 2 == 0) {
                element *= element;
            }

            // Write element into the result Array.
            result[i] = element;
        }
        System.out.println(Arrays.toString(result));
        // Return the result Array.
        return result;
    }
}
