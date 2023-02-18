package org.example.leetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lengthOfFirstArray = m + n;
        int secondNumArray[] = Arrays.copyOf(nums1, lengthOfFirstArray);
        System.arraycopy(nums2, 0, secondNumArray, m, n);
        Arrays.sort(secondNumArray);
        System.out.println(Arrays.toString(secondNumArray));
    }

    public static void mergeWithWhile(int[] nums1, int m, int[] nums2, int n){
        int[] ans = new int[m+n];
        for(int  i = 0; i<m; i++) { // 1st for loop
            ans[i] = nums1[i];
        }
        for(int i = 0; i<n ; i++) { // 2nd for loop
            ans[m+i] = nums2[i];
        }
        Arrays.sort(ans);
        for(int i = 0; i<nums1.length; i++) {  // 3rd for loop
            nums1[i] = ans[i];
        }
    }
}
