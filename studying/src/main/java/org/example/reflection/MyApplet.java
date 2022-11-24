package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class MyApplet {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2 = SomeClass.class;
        try {
            Class clss3 = Class.forName("com.video.lessons.SomeClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            SomeClass someClass1 = (SomeClass)clss.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Constructor[] constructors = clss.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }

    }

}

class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {

    }

    SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this is " + s);
        return s;
    }
}
