package org.example.leetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        containsDuplicate(nums);
        //containsDuplicate(nums2);
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean status = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    status = true;
                    break;
                }
            }
            if (status){
                break;
            }
        }
        System.out.println(status);
        return status;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
