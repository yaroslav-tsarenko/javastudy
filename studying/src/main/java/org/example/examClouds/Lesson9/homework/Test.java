package org.example.examClouds.Lesson9.homework;

public class Test {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int b[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int c[][] = new int[3][3];

        System.out.print("Матрица: ");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        int s = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
        System.out.println();
        System.out.println("Результат :");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }
}

