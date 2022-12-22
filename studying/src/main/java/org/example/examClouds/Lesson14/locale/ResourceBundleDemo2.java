package org.example.examClouds.Lesson14.locale;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        printInfo("", "");
        printInfo("en", "US");
        printInfo("uk", "UA");
    }

    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}