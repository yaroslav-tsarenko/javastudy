package org.example.examClouds.Lesson13.homework;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    private static final String INPUT = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 " +
            "333 111 6666 4682 592985";

    private static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+");
    private static final String[] EXCLUDED_SYMBOLS = {",", "."};

    public static void main(String[] args) {
        String[] palindromes = isPalindromeDemo.findPalindromes(INPUT, NUMBER_PATTERN, EXCLUDED_SYMBOLS);
        System.out.println(Arrays.toString(palindromes));
    }
}
