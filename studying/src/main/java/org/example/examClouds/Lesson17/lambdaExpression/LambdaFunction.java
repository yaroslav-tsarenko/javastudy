package org.example.examClouds.Lesson17.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        //Consumer<String> consumer2 = A::new;
        Function<A, String> f = A::getA;
        f.apply(new A());
    }

    static class A {
        final String a = "ololo";

        public String getA() {
            return a;
        }
    }
}
