package org.example.examClouds.Lesson5.homework;

public class DoWhile {
    public static void main(String[] args) {
        int n = 0;
        do {
            n++;
            if (n % 5 == 0){
                System.out.println(n);
            }
        } while (n < 100);
    }
}
