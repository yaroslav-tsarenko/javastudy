package org.example.examClouds.Lesson9.homework;

public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] array = {{4, 5, 6},
                         {6, 8, 9},
                         {10, 5, 2}};

        int[][] array2 = {{1, 8, 9},
                          {2, 3, 4},
                          {1, 9, 5}};

        matrix.print(array, array2);
        matrix.matrixAdd(array, array2);
        matrix.matrixMultiplication(array, array2);
        matrix.matrixMultiplicationOnNumber(array, 100);

    }

    public void print(int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("Print: ");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixAdd(int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("Matrix sum: ");
        int[][] matrixIndex = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixIndex[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(matrixIndex[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
        System.out.println("Matrix multiplication: ");
        int[][] matrixIndex = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixIndex[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                System.out.print(matrixIndex[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixMultiplicationOnNumber(int[][] firstMatrix, int number) {
        System.out.println("Matrix multiplication on number: ");
        int[][] matrixIndex = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixIndex[i][j] = firstMatrix[i][j] * number;
                System.out.print(matrixIndex[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

