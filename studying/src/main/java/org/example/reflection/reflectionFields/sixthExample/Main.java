package org.example.reflection.reflectionFields.sixthExample;

import jdk.jfr.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field serialNumberField = carClass.getField("serialNumber");

        System.out.println("Before change:" + serialNumberField.get(car));
        serialNumberField.set(car, "37U1");
        System.out.println("After change:" + serialNumberField.get(car));
    }
}

//Якщо ви забули, то змінна serialNumber у нас final. А final змінної не можна просто так взяти і змінити значення.
// Але якщо дуже сильно хочеться, то setAccessible(true) вам на допомогу

class SetAccessible{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field serialNumberField = carClass.getField("serialNumber");

        System.out.println("Before change:" + serialNumberField.get(car));
        serialNumberField.setAccessible(true);
        serialNumberField.set(car, "37U1");
        System.out.println("After change:" + serialNumberField.get(car));
    }
}