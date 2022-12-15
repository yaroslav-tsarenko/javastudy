package org.example.examClouds.Lesson11.interfaceIntroduction.defaultInterface;

public interface SomeInterface {
    default String defaultMethod() {
        return "Объект типа String по умолчанию";
    }
}
