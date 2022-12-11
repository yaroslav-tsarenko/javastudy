package org.example.examClouds.Lesson9.accessLevelModifier;

public class Modificators {
    public int publicVar; // открытый уровень доступа
    private int privateVar; // закрытый уровень доступа
    int defaultVar; // уровень доступа по умолчанию

    public String toString() {
        return "Modificators{"
                + "publicVar=" + publicVar
                + ", privateVar=" + privateVar
                + ", defaultVar=" + defaultVar
                + '}';
    }
}
