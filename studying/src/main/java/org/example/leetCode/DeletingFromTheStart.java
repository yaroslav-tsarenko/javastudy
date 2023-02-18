package org.example.leetCode;

public class DeletingFromTheStart {
    public static void main(String[] args) {

        int[] int_array = new int[10];
        int length = 0;

        // Starting at index 1, we shift each element one position
        // to the left.

        for (int i = 1; i < length; i++) {
            // Shift each element one position to the left
            int_array[i - 1] = int_array[i];
        }

        // Note that it's important to reduce the length of the array by 1.
        // Otherwise, we'll lose consistency of the size. This length
        // variable is the only thing controlling where new elements might
        // get added.

        length--;
    }
}
