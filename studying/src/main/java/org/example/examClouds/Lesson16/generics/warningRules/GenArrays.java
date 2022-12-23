package org.example.examClouds.Lesson16.generics.warningRules;

import org.example.examClouds.Lesson16.generics.parameterizedHierarchy.GenericSub;

public class GenArrays {
    public static void main(String[] args) {
        // Нельзя создать массив специфичных для типа обобщенных ссылок.
        // GenericSub<Integer>[] gens = new GenericSub<Integer>[10];

        GenericSub<?>[] gens = new GenericSub<?>[10];
        gens[0] = new GenericSub<>(34);
    }
}
