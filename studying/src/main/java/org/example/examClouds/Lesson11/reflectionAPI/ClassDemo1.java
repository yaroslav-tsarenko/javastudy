package org.example.examClouds.Lesson11.reflectionAPI;

import java.io.Serializable;
import java.util.Arrays;

public class ClassDemo1 {
    public static void main(String[] args) {
        getClassName1();
        getClassName2();
        getClassName3();
    }

    private static void getClassName1() {
        String s = "Это строка";
        Class aClass = s.getClass();
        System.out.println(aClass);
    }

    private static void getClassName2() {
        try {
            Class aClass = Class.forName("java.lang.String");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getClassName3() {
        Class aClass = String.class;
        System.out.println(aClass);
    }
}

 class ClassDemo2 {
    public static void main(String[] args) {
        int[] array = new int[4];

        printInfo(array.getClass());
        printInfo(Serializable.class);
        printInfo(Integer.class);
        printInfo(double.class);
    }

    private static void printInfo(Class arrayClass) {
        System.out.println("Class name " + arrayClass.getName());
        System.out.println("Is Array? " + arrayClass.isArray());
        System.out.println("Is Interface? " + arrayClass.isInterface());
        System.out.println("Is Primitive? " + arrayClass.isPrimitive());
        System.out.println();
    }
}

/**
 * Методы класса Class
 * <li>getSuperclass() - возвращает супер класс объекта ссылочного типа.
 * <li>getPackage() - возвращает пакет.
 * <li>getModifiers() - возвращает модификаторы класса.
 * Логические методы позволяющие уточнить, является ли объект массивом, интерфейсом или примитивным типом.
 *
 * <li>isArray()
 * <li>isInterface()
 * <li>isPrimitive()
 * Если объект ссылочного типа, то можно извлечь сведения о вложенных классах, конструкторах, методах в виде массива:
 *
 * <li>getDeclaredClasses()
 * <li>getDeclaredConstructors()
 * <li>getDeclaredMethods()
 * <li>getDeclaredFields()
 * Методы возвращают такие же массивы, но не всех, а только открытых членов класса.
 *
 * <li>getClasses()
 * <li>getConstructors()
 * <li>getMethods()
 * <li>getFields()
 */
