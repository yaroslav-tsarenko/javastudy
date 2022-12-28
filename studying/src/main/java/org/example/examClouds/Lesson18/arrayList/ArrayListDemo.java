package org.example.examClouds.Lesson18.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = Arrays.asList("F","FF", "E");

        System.out.println("Beginning size of arraylist: " + arrayList.size());

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("F");

        arrayList.set(0, "C2");
        arrayList.remove(4);
        arrayList.addAll(3, arrayList2);

        System.out.println("Size of arraylist after added symbols: " + arrayList.size());
        System.out.println("Containing of arraylist: " + arrayList);
        System.out.println(arrayList.get(0));
    }
}
