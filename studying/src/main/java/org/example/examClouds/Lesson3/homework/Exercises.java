package org.example.examClouds.Lesson3.homework;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        int a = 10;
        String str = "Hello";
        char t = 'g';
        double double1 = 5.4;
        System.out.println("Логічний ітерал: " + true);
        System.out.println("Логічний ітерал 10-й: " + 5);
        System.out.println("Логічний ітерал 16-й: " + 0XAb11);
        System.out.println("Логічний ітерал 2-й: " + 0b11);
        System.out.println("Літерал з плаваючою точкою: " + double1);
        System.out.println("Символьний літерал: " + t);
        System.out.println("Лінійний літерал: " + str);
        System.out.println("Цілочисленний літерал: " + a);


    }
}

class Calculator{
    public static void main(String[] args) {
        int x = sum(3, 4);
        System.out.println(x);

    }


    static int sum(int a, int b) {
        return (a + b);
    }
}

class RefactorVariable{
    public static void main(String[] args) {
        int a = 5;
        byte b = (byte) a;
        System.out.println(b);      // 5
    }
}


class CalculatorAdvanced{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int s1 = scanner.nextInt(), s2 = scanner.nextInt();
        int x = sum(s1, s2);
        System.out.println(x);
    }

    static int sum(int firstVariable, int secondVariable){
        return (firstVariable + secondVariable);
    }

}