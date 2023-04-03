package org.example.leetCode;

public class MissingPositiveNum {
    public static void main(String[] args) {
        int[] arrayForEqual = {2, 3, 4, 7, 11};
        // findKthPositive(arrayForEqual, 5);
        findKthPositive(arrayForEqual, 5);
    }

    public static void findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k){
                k++;//
            }else {///
                break;
            }
        }
        System.out.println(k);
    }
}
