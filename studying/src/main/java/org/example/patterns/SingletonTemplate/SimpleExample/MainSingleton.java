package org.example.patterns.SingletonTemplate.SimpleExample;

public class MainSingleton {
        public static void main(String[] args) {

            MySingleton.INSTANCE.printName();

            System.out.println(MySingleton.INSTANCE.getClass());
        }
}
