package org.example.reflection.reflectionFields.fivthExample;

import jdk.jfr.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = carClass.getDeclaredField("horsepower");

        Class<?> declaringClass = horsepowerField.getDeclaringClass(); // возвращает класс, в котором объявлено поле
        System.out.println(declaringClass); //output: class com.vertex.reflection.Car

        boolean enumConstant = horsepowerField.isEnumConstant(); //возвращает true, если поле является значением перечисления
        System.out.println(enumConstant); //output: false

        boolean synthetic = horsepowerField.isSynthetic(); // возвращает true, если метод синтетический (генерируется JVM)
        System.out.println(synthetic); //output: false

        boolean canAccess = horsepowerField.canAccess(car); // возвращает true, если к полю есть доступ (к примеру, оно не приватное)
        System.out.println(canAccess); //output: false

        boolean isPresent = horsepowerField.isAnnotationPresent(Description.class);// возвращает true, если такая аннотация присутствует на поле
        System.out.println(isPresent); //output: false

        System.out.println(horsepowerField.isAnnotationPresent(NamedArg.class)); //output: true

    }
}
