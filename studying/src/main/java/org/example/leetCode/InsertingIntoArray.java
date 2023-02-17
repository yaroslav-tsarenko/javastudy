package org.example.leetCode;

public class InsertingIntoArray {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;

        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

        intArray[length] = 10;
        length++;

        intArray[length] = 5;
        length++;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
