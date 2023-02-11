package org.example.leetCode;

import java.util.HashMap;
import java.util.function.Supplier;

public class TwoSum {

    public static void main(String[] args) {

        int target = (int) ((Math.random() * 30) + 1);
        System.out.println("Target = " + target);

        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }

        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(array, target));
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]) && i != map.get(target - numbers[i])) {
                return new int[]{i, map.get(target - numbers[i])};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
