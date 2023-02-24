package org.example.leetCode;

import java.util.Arrays;

public class HeightsChecker {
    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int[] clone = heights.clone();
        Arrays.sort(clone);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if ((clone[i] != heights[i])){
                res++;
            }
        }
        return res;
    }
}
