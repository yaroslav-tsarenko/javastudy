package org.example.leetCode;

import java.util.Arrays;

public class TheThirdMaximumNumber {
    public static void main(String[] args) {
        int[] firstNum = {3, 2, 1};
        int[] secondNum = {1, 2};
        int[] thirdNum = {2, 2, 3, 1};


    }

    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num: nums) {
            if (firstMax == num || secondMax == num || thirdMax == num){
                continue;
            } else if (secondMax <= num) {
                thirdMax = secondMax;
                secondMax = num;
            }else if (thirdMax <= num){
                thirdMax = num;
            }
        }
        if (thirdMax == Long.MIN_VALUE){
            int ans = (int) firstMax;
            return ans;
        }

        int ans = (int) thirdMax;
        return ans;

    }

    public int thirdMax2(int[] nums) {
        // Sort the array in non-increasing order.
        Arrays.sort(nums);

        // Reverse array to make it non-increasing.
        for (int index = 0; index < nums.length / 2; ++index) {
            int temp = nums[index];
            nums[index] = nums[nums.length - 1 - index];
            nums[nums.length - 1 - index] = temp;
        }

        int elemCounted = 1;
        int prevElem = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            // Current element is different from previous.
            if (nums[index] != prevElem) {
                elemCounted += 1;
                prevElem = nums[index];
            }

            // If we have counted 3 numbers then return current number.
            if (elemCounted == 3) {
                return nums[index];
            }
        }

        // We never counted 3 distinct numbers, return largest number.
        return nums[0];
    }
}
