package org.example.leetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 4, 2, 7, 2, 4, 2, 4};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(nums, val);
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n){
            if (nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
       return n;
    }
}
