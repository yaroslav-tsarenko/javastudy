package org.example.patterns.SingletonTemplate.TrickyRealizationExample;

public class Test {
    public static void main(String[] args) {

        MySingleton firstInstance = MySingleton.getInstance();

        System.out.println(firstInstance.getClass());

        MySingleton secondInstance = MySingleton.getInstance();

    }
}