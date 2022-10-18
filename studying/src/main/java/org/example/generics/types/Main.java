package org.example.generics.types;

public class Main {
    public static void main(String[] args) {
        Point<Float, Integer> pt = new Point<>(1f,2f);
        Point<Double, String> ptD = new Point<>(10.4, 15.2);
//        pt.x = 10;
//        pt.y = 10;
//
//        ptD.x = 20.5;
//        ptD.y = 34.5;
        /*Тільки цілі значення*/
        System.out.println(pt.x + " " + pt.y);
        System.out.println(ptD.x + " " + ptD.y);
        System.out.println(pt.getCordX() + " " + pt.getCordY());

        for(Object cord: pt.getCords())
            System.out.println((Float)cord);
    }
}

class Point<T, V> {
    public V id;
    public T x, y;
    Point(T x, T y){
        this.x = x;
        this.y = y;
    }
    V getId(){
        return id;
    }
    T getCordX(){
        return x;
    }

    T getCordY(){
        return y;
    }

    Object[] getCords(){
        return new Object[]{x,y};
    }
}


