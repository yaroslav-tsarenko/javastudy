package org.example.leetCode;

import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseEffective(120));
    }

    public static int reverse(int x) {
        String s = Integer.toString(x);
        char[] symbols = s.toCharArray();
        int size = symbols.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = symbols[i];
            symbols[i] = symbols[size - 1 - i];
            symbols[size - 1 - i] = (char) temp;
        }
        int reversedNum = Integer.parseInt(Arrays.toString(symbols));
        return reversedNum;
    }

    public static int reverseEffective(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {

            }
            result = result * 10 + pop;
        }
        return result;
    }
}
