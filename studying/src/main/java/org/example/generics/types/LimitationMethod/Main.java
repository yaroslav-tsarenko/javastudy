package org.example.generics.types.LimitationMethod;

public class Main {
    public static void main(String[] args) {
        Digit d1 = new Digit(10);
        Digit d2 = new Digit(10.5);
        Digit d3 = new Digit(10.5f);

        System.out.println(d1.value + " " + d2.value + " " + d3.value);
    }
}

class Point<T extends Number> {

    public T x, y;

    Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    double getMax() {
        double xd = x.doubleValue();
        double yd = y.doubleValue();

        return (xd < yd) ? yd : xd;

    }

    boolean equalsPoint(Point<? extends Number> pt) {
        return (this.x.doubleValue() == pt.x.doubleValue() &&
                this.y.doubleValue() == pt.y.doubleValue());
    }
}

class Math {
    public static <T> boolean isIn(T val, T[] ar) {
        for (T v : ar)
            if (v.equals(val)) return true;
        return false;
    }
}

class Digit {
    public double value;

    <T extends Number> Digit(T value) {
        this.value = value.doubleValue();
    }
}
