package org.example.examClouds.Lesson5.OperatorDoWhile;

public class FromOneToHundred {
        public static void main(String[] args) {
            int n = 1;
            do {
                System.out.println("Tick " + n++);
            } while (n <= 100);
        }
}

class SomeClass {
    public static void main(String[] args) {
        int i = 0, j = 2;
        do {
            i = ++i;
            j--;
        }
        while (j > 0);
        System.out.println(i);
    }
}

class MyProgram {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " and j = " + j);
    }
}
