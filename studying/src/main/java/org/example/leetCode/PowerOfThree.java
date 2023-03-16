package org.example.leetCode;

public class PowerOfThree {
    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;
        else if
        ((n == 1) || (n % 3 == 0 && isPowerOfThree(n / 3)))
            return true;
        else return false;
    }
}
