package org.example.examClouds.Lesson14.numberFormat;

import java.text.NumberFormat;

public class NumberFormatDemo2 {
    /**
     *<li> setMaximumFractionDigits(int digits) - устанавливает максимальное количество цифр после десятичной точки в форматируемом объекте. Последняя отображаемая цифра округляется.
     *<li> setMaximumlntegerDigits(int digits) - устанавливает максимальное количество цифр перед десятичной точкой в форматируемом объекте. Используйте этот метод с предельной осторожностью. Если вы зададите слишком мало цифр, число будет просто усечено, и результат станет совершенно неправильным!
     *<li> setMinimumFractionDigits(int digits) - устанавливает минимальное количество цифр после десятичной точки в форматируемом объекте. Если количество цифр в дробной части числа меньше минимального, то на экран выводятся замыкающие нули.
     *<li> setMinimumlntegerDigits(int digits) - устанавливает минимальное количество цифр перед десятичной точкой в форматируемом объекте. Если количество цифр в целой части числа меньше минимального, то на экран выводятся ведущие нули.
     *<li> getMaximumFractionDigits() - возвращает максимальное количество цифр после десятичной точки в форматируемом объекте.
     *<li> getMinimumFractionDigits() - возвращает минимальное количество цифр после десятичной точки в форматируемом объекте.
     * @param
     */
    public static void main(String[] args) {
        double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();

        System.out.print("Максимальное количество знаков в дробной части "
                + nf.getMaximumFractionDigits() + ": ");
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(7);
        System.out.print("Максимальное количество знаков в дробной части 7: ");
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(2);
        System.out.print("Максимальное количество знаков в целой части 2: ");
        System.out.println(nf.format(d));
    }
}