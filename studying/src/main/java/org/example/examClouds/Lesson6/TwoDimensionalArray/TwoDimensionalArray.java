package org.example.examClouds.Lesson6.TwoDimensionalArray;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        char symbol = 'a';
        String[][] array = new String[7][10];
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

class Matrix{
    public static void main(String[] args) {
        int[] number = {1,2,3};
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[0][0]);

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
    }
}

class SquareArray{
    public static void main(String[] args) {
        int[] number = {1,2,3};
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class RealizingDifferentLines {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class AnotherVariantToPrint {
    public static void main(String[] args) {
        double[][] arrayTwoD = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };
        for (double[] arrayOneD : arrayTwoD) {
            for (double element : arrayOneD) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}


