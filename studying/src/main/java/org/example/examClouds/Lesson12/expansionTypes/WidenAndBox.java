package org.example.examClouds.Lesson12.expansionTypes;

public class WidenAndBox {
    /**
     * Нельзя расширить и упаковать. Значение типа byte не может стать Long. Нельзя расширить от одного класса обертки к другой. (IS-A не работает).
     * @param
     */
    static void go(Long x) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        byte b = 5;
        // go(b); // нужно расширить до long и упаковать, что невозможно
    }
}
