package org.example.examClouds.Lesson16.homework;

import java.math.BigDecimal;

public class Calculator {
    public static void main(String[] args) {
        sum(5, 6);
        divide(5.0, 2f);
        subtraction(4f, 3.0);
        multiply(4.0, 6);
    }

    public static <A, B> void sum(A a, B b) {
        BigDecimal firstValue = new BigDecimal(String.valueOf(a));
        BigDecimal secondValue = new BigDecimal(String.valueOf(b));
        BigDecimal result = firstValue.add(secondValue);
        System.out.println(result);
    }

    public static<A, B> void divide(A a, B b) {
        BigDecimal firstValue = new BigDecimal(String.valueOf(a));
        BigDecimal secondValue = new BigDecimal(String.valueOf(b));
        BigDecimal result = firstValue.divide(secondValue);
        System.out.println(result);
    }

    public static<A, B> void multiply(A a, B b) {
        BigDecimal firstValue = new BigDecimal(String.valueOf(a));
        BigDecimal secondValue = new BigDecimal(String.valueOf(b));
        BigDecimal result = firstValue.multiply(secondValue);
        System.out.println(result);
    }

    public static<A, B> void subtraction(A a, B b) {
        BigDecimal firstValue = new BigDecimal(String.valueOf(a));
        BigDecimal secondValue = new BigDecimal(String.valueOf(b));
        BigDecimal result = firstValue.subtract(secondValue);
        System.out.println(result);
    }
}
