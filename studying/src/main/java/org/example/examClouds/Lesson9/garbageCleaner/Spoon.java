package org.example.examClouds.Lesson9.garbageCleaner;

public class Spoon {
    @Override
    protected void finalize() {
        System.out.println("Ложка исчезает навсегда");
    }
}
