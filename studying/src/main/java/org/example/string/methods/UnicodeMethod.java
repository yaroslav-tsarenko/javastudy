package org.example.string.methods;

public class UnicodeMethod {
        public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = "Java";
        System.out.println(str1.codePointAt(1));
        /*Print: 97 (Кодування юнікод)*/
    }
 }

