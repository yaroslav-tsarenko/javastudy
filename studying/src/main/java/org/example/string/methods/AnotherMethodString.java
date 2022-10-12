package org.example.string.methods;

public class AnotherMethodString {
    public static void main(String[] args) {
        String number = "+12345678913";
        boolean result = number.matches("(\\+*)\\d{11}");
        if (result == true)
            System.out.println("Number");
        else
            System.out.println("Not number");
    }
    /*Виводить правильне твердження коли є одинадцять чисел, плюс або мінус*/
}

