package org.example.java.time.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoundCurrentLetters {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println(" ");
    }
}
