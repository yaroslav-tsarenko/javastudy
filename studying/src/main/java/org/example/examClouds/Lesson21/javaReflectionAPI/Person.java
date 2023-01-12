package org.example.examClouds.Lesson21.javaReflectionAPI;

public abstract class Person {
    private Long id;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
