package org.example.algorithms.fibonacciNums;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] memoization = new long[n + 1];
        Arrays.fill(memoization, -1);
        System.out.println(fibNaive(n, memoization));
        System.out.println(fibEffective(n));
        System.out.println(fibWithInt(n));
    }

    // O(2^n)
    private static long fibNaive(int n, long[] memoization) {
        if (memoization[n] != -1)
            return memoization[n];
        if (n <= 1) {
            return n;
        }
        long result = fibNaive(n - 1, memoization) + fibNaive(n - 2, memoization);
        memoization[n] = result;
        return result;
    }

    // O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; // O(n)

        arr[0] = 0;// O(1)
        arr[1] = 1;// O(1)

        for (int i = 2; i <= n; i++) // O(n)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n]; // O(1)

        // O(n) + O(1) + O(1) + O(1) + O(n) = O(2n) + O(3) = O(2n + 3) = O(n)
    }

    private static int fibWithInt(int n) {
        int a = 1;
        int b = 0;
        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
        }
        return a;
    }
}
