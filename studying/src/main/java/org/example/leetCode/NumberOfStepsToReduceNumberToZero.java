package org.example.leetCode;

public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int num = 14;
        numberOfSteps(14);
    }

    public static void numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                // num = num / 2
            } else {
                num--;
                //reminder is 1
            }
            steps++;
        }
        //return steps;
        System.out.println(steps);
    }
}
