package org.example.leetCode;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 1};
        int[] arr2 = {3, 5, 5};
        int[] arr3 = {0, 3, 2, 1};
        validMountainArray(arr);
    }

    public static boolean validMountainArray(int[] arr) {
       int i = 0;
       while (i < arr.length && i + 1 < arr.length && arr[i] < arr[i + 1]){
           i++;
       }

       if (i == 0 || i + 1 >= arr.length){
           return false;
       }
       while (i < arr.length && i + 1 < arr.length){
           if (arr[i] <= arr[i++ + 1]){
               return false;
           }
       }
       return true;
    }
}
