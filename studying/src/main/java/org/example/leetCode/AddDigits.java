package org.example.leetCode;

import org.example.examClouds.Lesson11.interfaceIntroduction.internalInterface.A;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {

    public static void main(String[] args) {
        int num = 38;
        int num2 = 11;
        int num3 = 0;
        int num4 = 2;
        int num5 = 3;
        System.out.println(addDigits2(num));


    }

    public static int addDigits(int num) {
        int isNum = num;
        int sum = 0;
        int count = 0;
        if (num == 0) {
            return count = num;
        } else if (num != 0) {
            String[] digitStings = String.valueOf(num).split("");
            for (String digitString : digitStings) {
                sum += Integer.parseInt(digitString);
            }
            String[] digitSum = String.valueOf(sum).split("");
            for (String splitSum : digitSum) {
                count++;
            }
        } else {
            return num;
        }
        return count;
    }

    public static int addDigits2(int num) {
        return 1 + (num - 1) % 9;
    }
}
