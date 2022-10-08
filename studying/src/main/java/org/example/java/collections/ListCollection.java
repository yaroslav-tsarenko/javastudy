package org.example.java.collections;

import java.util.*;

public class ListCollection {
    //    public static void main(String[] args) {
//        Set<String> fruits = new TreeSet<>();
//        fruits.add("apple");
//        fruits.add("cherry");
//        fruits.add("watermelon");
//        fruits.add("apple");
//        System.out.println(fruits);
//    }
    public static void main(String[] args) {
    Map<String, Integer> fruits = new TreeMap<>();
    fruits.put("apple", 6);
    fruits.put("pineapple", 6);
    fruits.put("cherry", 5);
    fruits.put("apple", 4);
        System.out.println(fruits);
    }
}
