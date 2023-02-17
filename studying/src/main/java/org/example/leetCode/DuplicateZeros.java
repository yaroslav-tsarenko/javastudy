package org.example.leetCode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                for (int j = 4; j >= 2 ; j--) {
                    array[i + 1] = array[i];
                }
                array[i] = 0;
                count = array[i];
            }
        }
        System.out.println(count);
    }
}
