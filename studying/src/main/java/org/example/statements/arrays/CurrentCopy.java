package org.example.statements.arrays;

import java.util.Arrays;

public class CurrentCopy {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] numbersCopy = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersCopy));
    }
}
