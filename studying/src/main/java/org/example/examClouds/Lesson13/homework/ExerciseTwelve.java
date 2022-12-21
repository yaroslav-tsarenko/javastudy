package org.example.examClouds.Lesson13.homework;

import java.util.regex.Pattern;

public class ExerciseTwelve {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
        Pattern pattern = Pattern.compile("\\D");
        String[] word = pattern.split(sb);
        String strings = word[5];
        StringBuffer stringBuffer = new StringBuffer(strings);
        stringBuffer.reverse();
        String data = stringBuffer.toString();
        if(strings.equals(data)){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }

    }
}
