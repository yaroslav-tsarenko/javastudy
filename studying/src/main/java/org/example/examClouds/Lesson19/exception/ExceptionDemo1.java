package org.example.examClouds.Lesson19.exception;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        subRoutine();
    }

    public static void subRoutine() {
        try {
            int d = 0;
            int a = 10 / d;
        }catch (ArithmeticException ex){
            System.err.println("Division by zero");
        }

    }

}
