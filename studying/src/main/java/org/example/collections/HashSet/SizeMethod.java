package org.example.collections.HashSet;

import java.util.HashSet;

public class SizeMethod {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        System.out.println("Before we add anything myHashSet size is " + myHashSet.size());

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

        System.out.println("Now myHashSet size is " + myHashSet.size());
    }
}
