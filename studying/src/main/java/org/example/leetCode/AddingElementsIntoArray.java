package org.example.leetCode;

public class AddingElementsIntoArray {
    public static void main(String[] args) {
        // Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

// Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = 10;
            length++;
        }


        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }

        intArray[0] = 20;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        // Say we want to insert the element at index 2.
// First, we will have to create space for the new element.
        for (int i = 4; i >= 2; i--) {
            // Shift each element one position to the right.
            intArray[i + 1] = intArray[i];
        }

// Now that we have created space for the new element,
// we can insert it at the required index.
        intArray[2] = 30;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
