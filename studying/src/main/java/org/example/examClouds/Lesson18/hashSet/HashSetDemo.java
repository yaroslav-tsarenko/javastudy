package org.example.examClouds.Lesson18.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Харків");
        set.add("Київ");
        set.add("Львів");
        set.add("Хмельницький");
        set.add("Харків");

        System.out.println(set);
    }
}
