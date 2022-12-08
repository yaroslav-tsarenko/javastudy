package org.example.examClouds.Lesson7.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 4, 8, 1, 6, 100, 53, 3, -5};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}

