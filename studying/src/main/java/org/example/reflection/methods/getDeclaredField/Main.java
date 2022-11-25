package org.example.reflection.methods.getDeclaredField;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        try {
            Field horsepowerField = carClass.getDeclaredField("horsepower");
            System.out.println(horsepowerField);
            Field blaBlaField = carClass.getDeclaredField("bla_bla");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
