package org.example.examClouds.Lesson16.generics.warningRules;

public class GenRestriction<T> {
    /**
     * Обобщениям присущи некоторые ограничения.
     * Рассмотрим их:
     *
     * 1. Нельзя создавать экземпляр по параметру типа. Ни обычный объект, ни массив:
     * @param
     */
    private T ob;
    private T[] array;

    public GenRestriction(T ob, T[] array) {
        // Недопустимо!!!
        //оb = new Т();
        //array = new Т[10];
        this.ob = ob;
        this.array = array;
    }
}
