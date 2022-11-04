package org.example.java.time.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnotherRegEx {
    public static void main(String[] args) {
        Pattern p4 = Pattern.compile("cat");
        Matcher m4 = p4.matcher("He captured a catfish for his cat");
        while (m4.find()){
            System.out.println(m4.start() + " " + m4.group() + " ");
        }
    }
}
