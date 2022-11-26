package org.example.patterns.SingletonTemplate;

public class Singleton {

    private Singleton(){

    }
    
    public static final Singleton INSTANCE = new Singleton();
}