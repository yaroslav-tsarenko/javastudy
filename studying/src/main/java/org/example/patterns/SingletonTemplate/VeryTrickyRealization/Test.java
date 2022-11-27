package org.example.patterns.SingletonTemplate.VeryTrickyRealization;

public class Test {
    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE);
        System.out.println(MySingleton.INSTANCE);
    }
}
