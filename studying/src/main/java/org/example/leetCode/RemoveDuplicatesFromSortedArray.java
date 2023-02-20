package org.example.leetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 4, 6, 6, 7, 8, 9};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            int second = nums[i+1];
            if(first != second) {
                result++;
                nums[result] = second;
            }
        }

        return result + 1;
    }


    // i = zero to eight
    // nums = [0,1,2,3,4,2,2,3,3,4]
    // result = 0
    // i = 0
    // i + 1 = 1
    // first = 0
    // second = 0
    // result  = 1
    // i = 1
    // i + 1 = 2
    // first = 0
    // second = 1
    // nums[result] = 1

    // i = 2
    // i + 1 =3
    // first = 1
    // second = 1

    // i = 3
    // i + 1 = 4
    // first = 1
    // second = 1

    // i = 4
    // i + 1 =5
    // result = 2
    // first = 1
    // second = 2
    // nums[2] = second
    // i = 5
    // i + 1 = 6
    // result = 2
    // first = 2; second = 2

    // i = 6
    // i + 1 = 7
    // first = 2; second = 3
    // result = 3
    // nums[3] = 3

    // i = 7
    // i + 1 = 8
    /// first = 3
    // second = 3

    // i = 8
    // i + 1 = 9
    // first = 3, second = 4
    // result  =4
    // nums[4] = 4
}
