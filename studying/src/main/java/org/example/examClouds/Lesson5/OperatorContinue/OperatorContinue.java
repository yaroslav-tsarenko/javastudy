package org.example.examClouds.Lesson5.OperatorContinue;

public class OperatorContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}


class ContinueLabel {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}