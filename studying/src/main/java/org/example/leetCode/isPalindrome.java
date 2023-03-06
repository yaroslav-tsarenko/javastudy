package org.example.leetCode;

import java.util.Arrays;

public class isPalindrome {
    public static void main(String[] args) {
        int x = -121;
        int a = 10;
        System.out.println(isPalindrome(x));


    }

    public static boolean isPalindrome(int x) {
        boolean status = false;
        String stringNum = Integer.toString(x);
        char[] symbols = stringNum.toCharArray();
        StringBuilder builder = new StringBuilder();
        builder.append(symbols);
        builder.reverse();
        try {
            int reversedNum = Integer.parseInt(String.valueOf(builder));
            if (x == reversedNum) {
                status = true;
            } else {
                status = false;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Number have '-' on in the end");
        }
        return status;
    }

    public boolean isPalindromeShorter(int x) {

        String k = String.valueOf(x);

        for (int i = 0; i < k.length() / 2; i++) {
            if (k.charAt(i) != k.charAt(k.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
