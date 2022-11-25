package org.example.reflection.methods.waysToGetMethods.getMethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<Car> carClass = Car.class;

        try {
            Method getHorsepowerMethod = carClass.getMethod("notifyAll");
            System.out.println(getHorsepowerMethod);

            Method printSerialNumberMethod = carClass.getMethod("printSerialNumber");
            System.out.println(printSerialNumberMethod);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
