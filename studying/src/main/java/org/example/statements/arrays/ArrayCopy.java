package org.example.statements.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int[] numbersCopy = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }
    }
}
