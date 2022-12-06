package org.example.examClouds.Lesson6.OneDimensionalArray;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println("B апреле " + monthDays[3] + " дней.");
    }
}

class Array {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("B апреле " + monthDays[3] + " дней.");
    }
}


class ArrayWithFor {
    public static void main(String[] args) {
        int[] testScores = {1, 2, 3, 4};
        for (int element : testScores) {
            System.out.print(element + " ");
        }
        System.out.println();
        testScores = new int[]{4, 7, 2};
        for (int element : testScores) {
            System.out.print(element + " ");
        }
        System.out.println();

        print(new int[]{4, 6, 2, 3});
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
