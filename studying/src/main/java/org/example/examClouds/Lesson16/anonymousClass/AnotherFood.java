package org.example.examClouds.Lesson16.anonymousClass;

public class AnotherFood {
    /**
     *Анонимный класс может не только переопределить методы класса наследника, но и добавить новые методы. Но новые методы НЕ могут быть вызваны извне анонимного класса:
     * @param
     */
    public static void main(String[] args) {
        Potato potato = new Potato() {
            public void fry() {
                System.out.println("Жарим картошку в анонимном классе.");
            }

            @Override
            public void peel() {
                System.out.println("Чистим картошку в анонимном классе.");
                fry();
            }
        };
        potato.peel();
        //Ошибка компиляции
        //potato.fry();
    }
}
