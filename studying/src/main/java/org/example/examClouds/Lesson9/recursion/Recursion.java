package org.example.examClouds.Lesson9.recursion;

public class Recursion {
    static int factorial(int n) {
        int result;

        if (n < 2) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial 3: " + factorial(3));
        System.out.println("Factorial 4: " + factorial(4));
        System.out.println("Factorial 5: " + factorial(5));
    }
}
