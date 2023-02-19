package org.example.leetCode;

public class DeletingFromAnywhereInArray {
    public static void main(String[] args) {

        // Declare an integer array of 10 elements.
        int[] int_array = new int[10];

        // The array currently contains 0 elements
        int length = 0;

        for(int i = 0; i < 6; i++) {
            int_array[length] = i;
            length++;
        }

        // Say we want to delete the element at index 1
        for (int i = 2; i < length; i++) {
            // Shift each element one position to the left
            int_array[i - 1] = int_array[i];
        }

        // Again, the length needs to be consistent with the current
        // state of the array.
        length--;

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + int_array[i]);
        }
    }
}
