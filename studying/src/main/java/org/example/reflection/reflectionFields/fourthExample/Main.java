package org.example.reflection.reflectionFields.fourthExample;

import jdk.jfr.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = null;
        try {
            horsepowerField = carClass.getDeclaredField("horsepower");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        Annotation[] annotations = horsepowerField.getAnnotations();
        System.out.println(Arrays.toString(annotations)); //output: [@jdk.jfr.Description(value="the power of an engine")]

        AnnotatedElement horsepower = null;
        Description descriptionAnnotation = horsepower.getAnnotation(Description.class);
        System.out.println(descriptionAnnotation); //output: [@jdk.jfr.Description(value="the power of an engine")]

        Annotation[] annotationsByType = horsepower.getAnnotationsByType(Description.class);
        System.out.println(Arrays.toString(annotationsByType)); //output: [@jdk.jfr.Description(value="the power of an engine
    }
}
