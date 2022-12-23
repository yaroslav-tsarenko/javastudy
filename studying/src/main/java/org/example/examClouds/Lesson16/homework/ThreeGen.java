package org.example.examClouds.Lesson16.homework;

public class ThreeGen<T extends String, V extends Animal, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTypes(){
        System.out.println("ob1: " + ob1.getClass().getName() + '\n'
                + "ob2: " + ob2.getClass().getName() + '\n' +
                "ob3: " + ob3.getClass().getName());
    }

    @Override
    public String toString() {
        return "ThreeGen{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                ", ob3=" + ob3 +
                '}';
    }

}
