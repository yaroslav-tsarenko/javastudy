package org.example.leetCode;

public class convertToTitle {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(convertToTitle(n));
    }

    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0) {
            columnNumber--;
            ans = (char) ('A' + (columnNumber % 26)) + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
}
