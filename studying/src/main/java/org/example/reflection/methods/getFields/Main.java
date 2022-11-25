package org.example.reflection.methods.getFields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        Field[] fields = carClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
