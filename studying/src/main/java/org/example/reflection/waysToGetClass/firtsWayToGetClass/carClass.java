package org.example.reflection.waysToGetClass.firtsWayToGetClass;

public class carClass {
    public static void main(String[] args) {
        try {
            Class<?> carClass = Class.forName("org.example.reflection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
