package org.example.examClouds.Lesson6.ArrayDeepToString;

import java.util.Arrays;

public class ArrayDeepToString {
    public static void main(String[] args) {
        String[][] array = {{"один-один", "один-два", "один-три"},
                {"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(array));
    }
}

