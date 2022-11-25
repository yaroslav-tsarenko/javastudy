package org.example.reflection.reflectionFields.thirdExample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = carClass.getDeclaredField("horsepower");

        String name = horsepowerField.getName();
        System.out.println(name); //output: horsepower

        Class<?> type = horsepowerField.getType();
        System.out.println(type); //output: int

        int modifiers = horsepowerField.getModifiers();
        System.out.println(modifiers); //output: 2

    }
}

class Modifier {

    public static void main(String[] args) throws NoSuchFieldException {

        Car car = new Car(500, "1233");
        Class<? extends Car> carClass = car.getClass();
        Field horsepowerField = carClass.getDeclaredField("horsepower");
        int modifiers = horsepowerField.getModifiers();
        System.out.println(Modifier.isPrivate(modifiers)); // output: true
        System.out.println(Modifier.isFinal(modifiers)); // output: false

    }

    private static boolean isPrivate(int modifiers) {
        return false;
    }

    private static boolean isFinal(int modifiers) {
        return false;
    }

}
