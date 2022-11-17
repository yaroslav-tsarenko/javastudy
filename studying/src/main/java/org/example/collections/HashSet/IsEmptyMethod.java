package org.example.collections.HashSet;

import java.util.HashSet;

public class IsEmptyMethod {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        System.out.println("At the beginning myHashSet is empty: " + myHashSet.isEmpty());

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

        System.out.println("After adding elements myHashSet is empty: " + myHashSet.isEmpty());

        myHashSet.clear();

        System.out.println("After clear myHashSet is empty: " + myHashSet.isEmpty());
    }
}
