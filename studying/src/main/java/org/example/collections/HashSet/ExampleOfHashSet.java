package org.example.collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class ExampleOfHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(4);
        set.add(3);

        System.out.println(set);
    }
}
