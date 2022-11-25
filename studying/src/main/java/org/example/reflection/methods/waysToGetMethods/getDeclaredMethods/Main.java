package org.example.reflection.methods.waysToGetMethods.getDeclaredMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }
}
