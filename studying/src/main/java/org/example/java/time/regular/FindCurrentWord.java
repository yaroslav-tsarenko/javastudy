package org.example.java.time.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCurrentWord {
    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("cat");
        Matcher m2 = p2.matcher("About cats and dogs");
        while(m2.find()){
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
        System.out.println(" ");
    }
}
