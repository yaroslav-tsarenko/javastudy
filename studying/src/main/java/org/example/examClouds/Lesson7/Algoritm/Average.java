package org.example.examClouds.Lesson7.Algoritm;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : numbers) {
            result += d;
        }
        System.out.println(" " + result / numbers.length);
        int n = 250;

    }
}

