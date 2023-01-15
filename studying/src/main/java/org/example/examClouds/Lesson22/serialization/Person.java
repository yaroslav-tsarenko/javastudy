package org.example.examClouds.Lesson22.serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -678395476893583L;

    private transient int id;
    private String name;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
