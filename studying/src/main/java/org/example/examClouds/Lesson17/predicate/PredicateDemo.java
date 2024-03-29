package org.example.examClouds.Lesson17.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s != null;
        Predicate<String> predicate2 = s -> !s.isEmpty();

        Predicate<String> predicate3 = predicate1.and(predicate2);

        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test("someString"));
    }
}
