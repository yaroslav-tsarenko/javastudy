package org.example.algorithms.greedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {

    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 8, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
        System.out.println(maxNumberFromDigitsShorter(digits));
    }

    public static String maxNumberFromDigits(int[] digits) {
        // {3, 1, 7, 8, 9, 9, 5} -> {1, 3, 7, 5, 9, 9}
        // O(n * log(n))
        // O(n)
        // O(n * log(n))

        Arrays.sort(digits);

        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    public static String maxNumberFromDigitsShorter(int[] digits) {
            return String.join("", Arrays.stream(digits).boxed()
                    .sorted(Collections.reverseOrder())
                    .map(String::valueOf)
                    .toArray(String[]::new));
    }

}
