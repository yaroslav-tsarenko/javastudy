package org.example.leetCode;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        SortByParity start = new SortByParity();
        int[] nums = {3, 1, 2, 4};
        start.sortArrayByParity(nums);
    }

    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];
        int temporaryNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                result[temporaryNum++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                result[temporaryNum++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(result));
        return result;

    }
}
