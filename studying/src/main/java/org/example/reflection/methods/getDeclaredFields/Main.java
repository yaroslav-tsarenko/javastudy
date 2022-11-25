package org.example.reflection.methods.getDeclaredFields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
}
