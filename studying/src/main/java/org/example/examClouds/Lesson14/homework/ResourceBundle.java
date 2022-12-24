package org.example.examClouds.Lesson14.homework;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class ResourceBundle {

        public static void main(String[] args) throws UnsupportedEncodingException {
            printInfo("en", "US");
            printInfo("fr", "FR");
        }

        private static void printInfo(String language, String country) throws UnsupportedEncodingException {
            Locale current = new Locale(language, country);
            java.util.ResourceBundle rb = java.util.ResourceBundle.getBundle("topic", current);
            String s1 = rb.getString("string1");
            String stringFormat1 = new String(s1.getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(s1);
            String s2 = rb.getString("string2");
            System.out.println(s2);
            String s3 = rb.getString("string3");
            System.out.println(s3);
            String s4 = rb.getString("string4");
            System.out.println(s4);
            String s5 = rb.getString("string5");
            System.out.println(s5);
            System.out.println();

        }
}
