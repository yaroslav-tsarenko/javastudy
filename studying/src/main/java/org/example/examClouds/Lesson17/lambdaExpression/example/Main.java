package org.example.examClouds.Lesson17.lambdaExpression.example;

import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;

public class Main {

    private static final BinaryOperator<Integer> addition = (number1, number2) -> {
        System.out.println("ADDITION FEATURE WORKING...");
        trySleep(2_000);
        return number1 + number2;
    };

    private static final BinaryOperator<Integer> subtraction = (number1, number2) -> {
        System.out.println("SUBTRACTION FEATURE WORKING...");
        trySleep(2_000);
        return number1 - number2;
    };

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(addition);
        calculator.add(subtraction);

        calculator.execute(10, 7);
    }

    private static void trySleep(int timeout) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
