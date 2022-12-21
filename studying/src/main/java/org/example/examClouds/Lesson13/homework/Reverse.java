package org.example.examClouds.Lesson13.homework;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("3434");
        if (stringBuffer.reverse().equals(stringBuffer)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not a palindrome");
        }
        System.out.println(isPalindrome("4554"));
        System.out.println(isPalindrome2("45577684"));
    }

    public static boolean isPalindrome(String text){
        return text.replaceAll("\\W", " ")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", " "))
                        .reverse().toString());
    }

    public static boolean isPalindrome2(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if(result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }
}
