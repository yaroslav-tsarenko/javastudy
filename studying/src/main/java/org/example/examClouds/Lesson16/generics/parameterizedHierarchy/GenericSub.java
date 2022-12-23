package org.example.examClouds.Lesson16.generics.parameterizedHierarchy;

public class GenericSub<T> extends GenericSuper<T> {
    public GenericSub(T ob) {
        super(ob);
    }
}
