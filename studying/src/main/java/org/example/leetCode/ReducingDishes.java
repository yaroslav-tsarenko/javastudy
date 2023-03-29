package org.example.leetCode;

import java.util.Arrays;

public class ReducingDishes {
    public static void main(String[] args) {

    }

    public int maxSatisfaction(int[] satisfaction) {
        int total = 0,
                res = 0;
        Arrays.sort(satisfaction);
        for (int i = satisfaction.length - 1; i >= 0 && total > -satisfaction[i]; i--) {
            total += satisfaction[i];
            res += total;
        }

        return res;
    }
}
