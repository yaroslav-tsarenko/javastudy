package org.example.examClouds.Lesson17.lambdaExpression;

import java.util.function.*;

public class ConsumerTest {
    public static void main(String[] args) {
        final Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printer.accept("1");
    }
}
