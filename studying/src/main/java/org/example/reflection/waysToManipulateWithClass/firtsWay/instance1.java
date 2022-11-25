package org.example.reflection.waysToManipulateWithClass.firtsWay;

class A {}

public class instance1 {
    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("A");
            boolean b1 = cls.isInstance(new Integer(37));
            System.out.println(b1);
            boolean b2 = cls.isInstance(new A());
            System.out.println(b2);
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
