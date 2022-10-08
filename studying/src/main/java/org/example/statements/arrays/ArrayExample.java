package org.example.statements.arrays;

public class ArrayExample {
    public static void main(String[] args) {
              int number = 10; //примітивний тип даних
        int [] numbers = new int[5]; //numbers -> [massive]
//        System.out.println(numbers[0]); // 0 -> index (відлік від 0 до 4)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int [] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
