package org.example.leetCode;

import org.example.statements.arrays.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] firstDigit = {1, 2, 3, 4, 5};
        int[] secondDigit = {4, 2, 3, 1,};
        int[] thirdDigit = {9};
        System.out.println(plusOne(firstDigit));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder strArray = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            strArray.append(digits[i]);
        }
        int x = (int) Long.parseLong(String.valueOf(strArray));
        x += 1;
        String stringNums = Integer.toString(x);
        int[] doneIntArray = new int[stringNums.length()];
        for (int i = 0; i < stringNums.length(); i++) {
            doneIntArray[i] = Integer.parseInt(String.valueOf(stringNums.charAt(i)));
        }
       return doneIntArray;
    }
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
