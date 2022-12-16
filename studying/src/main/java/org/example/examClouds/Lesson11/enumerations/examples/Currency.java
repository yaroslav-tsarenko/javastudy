package org.example.examClouds.Lesson11.enumerations.examples;

public enum Currency implements Runnable {
    /**
     * Для перечислений можно переопределять методы, но это не совсем обычное переопределение.
     *
     * Добавим в наше перечисление метод getLid(), который возвращает код крышки для чашки кофе. Для всех констант подходит код B, который возвращает этот метод, кроме константы OVERWHELMING. Для OVERWHELMING чашки нужен код A. Переопределим метод getLid() для этой константы. Как это делается? После объявления константы открываем фигурные скобки, в которых и переопределяем этот метод. Если необходимо переопределить несколько методов, это делается в этих же фигурных скобках.
     * @param
     */
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;

    Currency(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("Перечисления в Java могут реализовывать интерфейсы");
    }
}
