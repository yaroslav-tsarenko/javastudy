package org.example.collections.HashSet;

import java.util.HashSet;

public class RemoveMethod {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

        System.out.println("Before remove:");
        for (int i : myHashSet)
            System.out.println(i);

        myHashSet.remove(1);
        System.out.println("After remove:");
        for (int i : myHashSet)
            System.out.println(i);

    }
}
