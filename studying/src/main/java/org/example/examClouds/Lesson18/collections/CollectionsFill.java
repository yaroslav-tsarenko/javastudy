package org.example.examClouds.Lesson18.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFill {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый");
        Collections.fill(list, "черный");
        System.out.println(list);
    }
}
