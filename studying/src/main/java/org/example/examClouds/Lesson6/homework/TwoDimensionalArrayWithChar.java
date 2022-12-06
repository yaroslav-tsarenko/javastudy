package org.example.examClouds.Lesson6.homework;

public class TwoDimensionalArrayWithChar {
    public static void main(String[] args) {
        char[][] array = {{'r', 'e'},
                          {'g', 'f'},
                          {'y', 'g'},
                          {'i', 'q'}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
