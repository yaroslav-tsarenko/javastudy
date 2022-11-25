package org.example.reflection.reflectionFields.seventhExample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = carClass.getDeclaredField("horsepower");
        horsepowerField.setAccessible(true);
        System.out.println("Before change:" + horsepowerField.getInt(car));
        horsepowerField.setInt(car, 751);
        System.out.println("After change:" + horsepowerField.getInt(car));

    }
}
