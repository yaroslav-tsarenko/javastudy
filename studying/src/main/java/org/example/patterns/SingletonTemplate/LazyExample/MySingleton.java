package org.example.patterns.SingletonTemplate.LazyExample;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
        System.out.println("Singleton created!");
    }

    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
