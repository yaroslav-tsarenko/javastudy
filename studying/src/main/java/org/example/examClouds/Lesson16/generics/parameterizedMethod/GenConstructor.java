package org.example.examClouds.Lesson16.generics.parameterizedMethod;

public class GenConstructor {

    private double value;

    public <T extends Number> GenConstructor(T arg) {
        value = arg.doubleValue();
    }

    public void showValue() {
        int count = 1;
        for (int i = 0; i < 1; i++) {
            System.out.println("value " + count++ + ": " + value);
        }
    }
}


