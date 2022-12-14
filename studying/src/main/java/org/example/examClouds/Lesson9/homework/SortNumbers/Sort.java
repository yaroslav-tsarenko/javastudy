package org.example.examClouds.Lesson9.homework.SortNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Sort start = new Sort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int numberA = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number B: ");
        int numberB = scanner.nextInt();
        start.recursion(numberA, numberB);

    }
    public void recursion(int a, int b){
        if (a < b){
            recursion(a, b - 1);
            System.out.print(b);
            if (b == 0){
                System.exit(0);
            }
        }else{
            System.out.println(a);
            recursion(a - 1, b);
        }
        if (a == 0){
            System.exit(0);
        }
    }
}
