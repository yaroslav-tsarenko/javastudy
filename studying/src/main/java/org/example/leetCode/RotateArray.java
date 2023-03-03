package org.example.leetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        //rotateArray(nums, k);
        rotateArray2(nums, k);
    }

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void rotateArray2(int[] nums, int k) {
        int n = nums.length;
        k %= n; // in case k is larger than n
        reverse(nums, 0, n - 1); // reverse the entire array
        reverse(nums, 0, k - 1); // reverse the first k elements
        reverse(nums, k, n - 1); // reverse the remaining elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
