package org.example.examClouds.Lesson12.wrapperClasses;

public class WrapperDemo3 {
    public static void main(String[] args) {
        Integer iOb = new Integer(1000);
        System.out.println(iOb.byteValue());
        System.out.println(iOb.shortValue());
        System.out.println(iOb.intValue());
        System.out.println(iOb.longValue());
        System.out.println(iOb.floatValue());
        System.out.println(iOb.doubleValue());
    }
}