package org.example.examClouds.Lesson5.OperatorFor;

public class VariableOfFor {
    public static void main(String[] args) {
        for (int i = 1, j = 4; i < j; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }
}

class InfinityCycle {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Do job inside a loop");

        }

    }
}

