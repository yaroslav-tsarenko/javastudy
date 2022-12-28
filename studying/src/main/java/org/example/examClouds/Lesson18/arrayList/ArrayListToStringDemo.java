package org.example.examClouds.Lesson18.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToStringDemo {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("C", "A", "E", "B", "D", "F");

        //first example
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //second example
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //third example
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
