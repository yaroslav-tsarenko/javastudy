package org.example.reflection.methods.waysToGetMethods.getEnclosingMethod;

import java.lang.reflect.Method;

public class Main {
    public static void anonymousClassExample() {
        Car car = new Car() {
            @Override
            protected void printSerialNumber() {

            }
        };
        Method enclosingMethod = car.getClass().getEnclosingMethod();
        System.out.println(enclosingMethod);
    }

    public static void main(String[] args) {
        anonymousClassExample();
    }
}
