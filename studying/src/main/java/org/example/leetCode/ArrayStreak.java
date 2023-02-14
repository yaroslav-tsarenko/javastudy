package org.example.leetCode;

public class ArrayStreak {
    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 2) + 0);
            System.out.println(array[i]);
        }
        arrayStreak(array);
    }

    public static void arrayStreak(int[] array) {
        int streak = 0, capacity = 0;
        for (int j : array) {
            if (j == 1) {
                capacity++;
                streak = Math.max(streak, capacity);
            } else {
                capacity = 0;
            }
        }
        System.out.println("Streakk: " + streak);
        //
    }
}