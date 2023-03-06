package org.example.leetCode;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 10, 11, 45};
        System.out.println(searchInsert(arr, 11));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
