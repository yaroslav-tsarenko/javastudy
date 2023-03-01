package org.example.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RunningFirstNum {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 0, 8};
        RunningFirstNum runningFirstNum = new RunningFirstNum();
        runningFirstNum.runningSum(array2);
        runningFirstNum.runningSumPerformed(array);
    }

    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i - 1];
        }
        System.out.println(Arrays.toString(results));
        return results;

    }

    public int[] runningSumPerformed(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
