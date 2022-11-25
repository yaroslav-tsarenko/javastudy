package org.example.reflection.reflectionFields.secondExample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = null;
        horsepowerField = carClass.getDeclaredField("horsepower");
        int horsepowerValue = 0;
        horsepowerValue = horsepowerField.getInt(car);

        System.out.println(horsepowerValue); //WRONG
    }
}

class currentExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = carClass.getDeclaredField("horsepower");
        horsepowerField.setAccessible(true);
        int horsepowerValue = horsepowerField.getInt(car);
        System.out.println(horsepowerValue); //output: 500
    }
}
