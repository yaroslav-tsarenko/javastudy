package org.example.reflection.methods.getField;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        try {
            Field serialNumberField = carClass.getField("serialNumber");
            System.out.println(serialNumberField);
            Field horsepowerField = carClass.getField("horsepower");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
