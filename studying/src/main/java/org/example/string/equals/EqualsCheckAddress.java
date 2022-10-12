package org.example.string.equals;

public class EqualsCheckAddress {
    public static void main(String[] args) {
        String s = "Apple";
        String t = new String("Apple");
        System.out.println(s == t);
        /*Так як тут різні адреси результат буде false*/
    }
}
