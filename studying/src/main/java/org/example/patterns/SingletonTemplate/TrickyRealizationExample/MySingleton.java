package org.example.patterns.SingletonTemplate.TrickyRealizationExample;

public class MySingleton {

    private MySingleton() {
        System.out.println("Singleton created!");
    }

    private static class SingletonHolder {
        public static final MySingleton HOLDER_INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}