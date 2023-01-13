package org.example.examClouds.Lesson22.serialization;

import java.io.Serializable;

public class Cat implements Serializable{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
