package org.example.leetCode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 5, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            max = Math.max(max, num);
        }
        return max;
    }

    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length/2;
        return nums[x];
    }
}
