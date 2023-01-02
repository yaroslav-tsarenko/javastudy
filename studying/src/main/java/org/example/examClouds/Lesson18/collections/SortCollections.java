package org.example.examClouds.Lesson18.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый");
        System.out.println("Перед сортировкой: " + list);
        Collections.sort(list);
        System.out.println("После сортировки: " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("После обратной сортировки: " + list);
    }
}
