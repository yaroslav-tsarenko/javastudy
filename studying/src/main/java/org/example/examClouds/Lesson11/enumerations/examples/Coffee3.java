package org.example.examClouds.Lesson11.enumerations.examples;

public class Coffee3 {
    /**
     * Перечисления могут быть объявлены: отдельным классом или как член класса. Но НЕ могут быть объявлены внутри метода.
     *
     * В этом пример перечисление CoffeeSize объявлено внутри класса Coffee3:
     * @param
     */
    enum CoffeeSize { BIG, HUGE, OVERWHELMING }

    CoffeeSize size;
}
