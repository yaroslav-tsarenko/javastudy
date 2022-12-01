package org.example.examClouds.Lesson4.ternaryOperation;

public class ternaryOperation {
        public static void main(String[] args) {
            int i, k;
            i = -10;
            k = i < 0 ? -i : i; // получить абсолютное значение переменной i
            System.out.print("Absolute value ");
            System.out.println(i + " equals " + k);
        }
}
