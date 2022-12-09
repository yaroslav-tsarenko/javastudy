package org.example.examClouds.Lesson7.homework;

public class BubbleSortChecker {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 2, 9, 3};
        sort(array);
        System.out.println();
        sortReverse(array);
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void sortReverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j < i; j--) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
