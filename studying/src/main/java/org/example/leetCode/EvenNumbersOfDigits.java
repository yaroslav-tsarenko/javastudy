package org.example.leetCode;

public class EvenNumbersOfDigits {
    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 99) + 1);
            System.out.println("Number: " + array[i]);
        }

        arrayDigit(array);

    }

    public static void arrayDigit(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
                int x = array[i];
                int r = (int) Math.floor(Math.log10(x) + 1);
                System.out.println("Digits: " + r);
                if (r % 2 == 0){
                    count++;
                }
        }
        System.out.println("Numbers which have digit which division by 2: " + count);
    }
}

class Solution {
    public static void findNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int r = (int) Math.floor(Math.log10(x) + 1);
            if (r % 2 == 0){
                count++;
            }
        }
    }
}
