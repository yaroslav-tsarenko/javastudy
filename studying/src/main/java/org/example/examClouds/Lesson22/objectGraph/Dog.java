package org.example.examClouds.Lesson22.objectGraph;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {
    private Collar theCollar;

    public Dog(Collar collar) {
        theCollar = collar;
    }

    public Collar getCollar() {
        return theCollar;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;

        return Objects.equals(theCollar, dog.theCollar);
    }

    @Override
    public int hashCode() {
        return theCollar != null ? theCollar.hashCode() : 0;
    }
}
