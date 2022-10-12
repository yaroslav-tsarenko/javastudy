package org.example.string.methods;

public class IndexMethod {
        public static void main(String[] args) {
        String str1 = new String("JAva");
        String str2 = "Java";
        System.out.println(str1.indexOf(65));
        /*Print: 1 (Так як символ є у кодуванні юнікод, інакше якби не було то -1)*/
    }
 }

