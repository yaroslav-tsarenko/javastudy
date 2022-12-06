package org.example.examClouds.Lesson6.homework;

import java.sql.SQLOutput;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        char symbol = 'a';
        String[][] array = new String[3][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
