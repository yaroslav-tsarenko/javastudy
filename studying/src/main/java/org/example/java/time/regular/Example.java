package org.example.java.time.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        //System.out.println("myEmail@gmail.com".matches("\\b[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"));

        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("my email is MyEmail@gmail.com");
        while (m.find()){
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println(" ");
    }
}
