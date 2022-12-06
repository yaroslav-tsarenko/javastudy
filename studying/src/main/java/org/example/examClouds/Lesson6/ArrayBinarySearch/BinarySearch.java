package org.example.examClouds.Lesson6.ArrayBinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 25);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
