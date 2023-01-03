package org.example.examClouds.Lesson17.lambdaExpression.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Calculator {

    private final List<BinaryOperator<Integer>> features = new ArrayList<>();

    public void execute(Integer num1, Integer num2) {
        for (BinaryOperator<Integer> feature : features) {
            System.out.println(feature.apply(num1, num2));
        }
    }

    public void add(BinaryOperator<Integer> feature) {
        features.add(feature);
    }
}
