package org.example.patterns.SingletonTemplate.VeryTrickyRealization;

public enum MySingleton {

    INSTANCE;

    private MySingleton() {
        System.out.println("Singleton created! By the way, in Enums the constructor is private by default - so there is no need to write private constructor by yourself");
    }
}
