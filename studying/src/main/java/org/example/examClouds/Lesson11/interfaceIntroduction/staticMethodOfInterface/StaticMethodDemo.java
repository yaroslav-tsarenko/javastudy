package org.example.examClouds.Lesson11.interfaceIntroduction.staticMethodOfInterface;

public class StaticMethodDemo {
    public static void main(String[] args) {
        MyIf obj1 = new MyIfImp();
        System.out.println(obj1.getNumber());
        System.out.println(MyIf.staticMethod());
    }
}