package org.example.examClouds.Lesson5.OperatorBreak;

public class CycleWithBreak {
    public static void main(String[] args) {
        int i = 0, n = 100;

        while (i < n) {
            if (i == 10) {
                break;
            }
            System.out.println("i: " + i++);
        }
        System.out.println("Cycle done.");
    }
}

class InternalCycle {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("First iteration " + i + " : ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Cycle done");
    }
}

class BreakWithMark {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break.");
                    if (t) {
                        break second;
                    }
                    System.out.println("This block of code will not complete.");
                }
                System.out.println("This block of code will not complete.");
            }
            System.out.println("After repeated code.");
        }
    }
}

class AnotherExampleWithMark {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("First iteration " + i + " : ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; // выход из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("This line will not be printed");
        }
    }
}


class Wind {
    public static void main(String[] args) {
        foreach:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
                if (j == 3 && k == 1) break foreach;
                if (j == 0 || j == 2) break;
            }
        }
    }
}