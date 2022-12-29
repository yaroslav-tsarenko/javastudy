package org.example.examClouds.Lesson18.hashSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSet<T> {
    public static void main(String[] args) {

        Set<String> set = new java.util.LinkedHashSet<>();

        set.add("Beta");
        set.add("Alpha");
        set.add("Eta");
        set.add("Gamma");
        set.add("Epsilon");
        set.add("Omega");
        System.out.println(set);
        before();

    }

    public static void before() {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}
