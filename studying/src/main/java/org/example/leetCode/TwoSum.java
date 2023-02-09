package org.example.leetCode;

import java.util.function.Supplier;

public class TwoSum {

    public static void main(String[] args) {

        int target = (int) ((Math.random() * 30) + 1);
        System.out.println("Target = " + target);

        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
            System.out.println(array[i]);
        }

        twoSum(array, target);

    }

    public static int[] twoSum(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[i] + numbers[i + 1];
            System.out.println(sum);
        }
        return null;
    }
}
