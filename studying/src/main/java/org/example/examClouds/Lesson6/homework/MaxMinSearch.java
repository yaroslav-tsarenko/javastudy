package org.example.examClouds.Lesson6.homework;

public class MaxMinSearch {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {

            }
            int maxNumber = Math.max(array[i].length, array.length);
            int minNumber = Math.min(array[i].length, array.length);
           // System.out.println(maxNumber);
           // System.out.println(minNumber);
            int[][] array2 = new int[maxNumber][minNumber];
            for (int g = 0; g < array2.length; g++) {
                for (int o = 0; o < array2[0].length; o++) {
                    System.out.println(array2[g][o] + " ");
                }

            }
        }
    }
}
