package org.example.examClouds.Lesson5.OperatorReturn;

public class ReturnOperator {
    public static void main(String[] args) {
            boolean t = true;
            System.out.println("Before return.");
            if (t) {
                return;
            }
            System.out.println("This operator will not be completed.");
        }
}

class SecondReturnExample {

    public static void main(String[] args) {
        double d = getRandomValue(3);
        System.out.println(d);
        doJob();

    }

    public static double getRandomValue(int i) {
        return Math.random() * i;
    }

    static boolean doJob() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Do job inside for loop");
            return true;
        }
        return true;
    }
}


