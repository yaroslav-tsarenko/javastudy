package org.example.reflection.waysToManipulateWithClass.thirdWay;

import java.lang.reflect.*;

public class field1 {
    private double d;
    public static final int i = 37;
    String s = "testing";

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("field1");

            Field fieldList[] = cls.getDeclaredFields();
            for (int i
                 = 0; i < fieldList.length; i++) {
                Field fld = fieldList[i];
                System.out.println("name = " + fld.getName());
                        System.out.println("decl class = " + fld.getDeclaringClass());
                System.out.println("type = " + fld.getType());
                int mod = fld.getModifiers();
                System.out.println("modifiers = " +
                        Modifier.toString(mod));
                System.out.println("-----");
            }
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}