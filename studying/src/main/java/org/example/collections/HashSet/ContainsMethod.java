package org.example.collections.HashSet;

import java.util.HashSet;

public class ContainsMethod {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

        System.out.println("Does myHashSet contain '1'? " + myHashSet.contains(1));
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));

    }
}
