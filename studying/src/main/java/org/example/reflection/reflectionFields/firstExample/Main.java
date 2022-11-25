package org.example.reflection.reflectionFields.firstExample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field serialNumberField = null;
        try {
            serialNumberField = carClass.getDeclaredField("serialNumber");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        String serialNumberValue = null; //указываем из какого объекта мы хотим получить значение
        try {
            serialNumberValue = (String) serialNumberField.get(car);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(serialNumberValue); //output: 1233
    }
}
