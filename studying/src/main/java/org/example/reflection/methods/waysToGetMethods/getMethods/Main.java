package org.example.reflection.methods.waysToGetMethods.getMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        Method[] methods = carClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
