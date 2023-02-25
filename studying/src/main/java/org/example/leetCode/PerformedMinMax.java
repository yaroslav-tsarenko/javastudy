package org.example.leetCode;

public class PerformedMinMax {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 50)+2);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        minNum(array);
        maxNum(array);
        avgNum(array);

    }

    public static void minNum(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Min number: " + min);
    }
    public static void maxNum(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Max number: " + max);
    }
    public static void avgNum(int[] array){
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i]/ array.length;
        }
        System.out.println("Avg number: " + avg);
    }
}

