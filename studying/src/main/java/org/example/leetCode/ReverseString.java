package org.example.leetCode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        SecondaryReverseString(s);
    }

    public static void reverseString(char[] s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        builder.reverse();
        System.out.println(builder);
    }

    public static void SecondaryReverseString(char[] s) {
        int size = s.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = s[i];
            s[i] = s[size - 1 - i];
            s[size - 1 - i] = (char) temp;
        }
        System.out.println(Arrays.toString(s));
    }

}
