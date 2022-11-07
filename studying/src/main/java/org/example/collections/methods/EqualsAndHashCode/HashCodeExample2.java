package org.example.collections.methods.EqualsAndHashCode;

import java.util.Objects;

public class HashCodeExample2 {
    public static void main(String[] args) {

    }

    static class Car {
        String color;
        String name;
        String number;

        @Override

        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return number != null ? number.equals(car.number) : car.number == null;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }
}

