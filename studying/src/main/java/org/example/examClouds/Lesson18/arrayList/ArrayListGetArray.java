package org.example.examClouds.Lesson18.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListGetArray {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));
    }
}
