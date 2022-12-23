package org.example.examClouds.Lesson16.generics.parameterizedHierarchy;

public class GenericSuper<T> {
    private T ob;

    public GenericSuper(T ob) {
        this.ob = ob;
    }

    private T getOb() {
        return ob;
    }
}
