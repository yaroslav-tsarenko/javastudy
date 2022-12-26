package org.example.examClouds.Lesson17.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> {
            String result = "Zero";
            if (i > 0) {
                result = "Positive number";
            } else if (i < 0) {
                result = "Negative number";
            }
            return result;
        };

        System.out.println(function.apply(-9));
        System.out.println(function.apply(9));
        System.out.println(function.apply(1));
        System.out.println(function.apply(-10));
    }
}
