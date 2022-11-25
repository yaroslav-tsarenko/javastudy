package org.example.reflection.methods.waysToGetMethods.getDeclaredMethod;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        try {
            Method printSerialNumberMethod = carClass.getDeclaredMethod("printSerialNumber");
            Method setHorsepowerMethod = carClass.getDeclaredMethod("setHorsepower", int.class);
            carClass.getDeclaredMethod("dodooooo");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
