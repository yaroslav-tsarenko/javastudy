package org.example.examClouds.Lesson12.wrapperClasses;

public class WrapperDemo2 {
    /**
     * В каждом классе оболочке содержатся методы, позволяющие преобразовывать строку в соответствующее примитивное значение. В классе Double - это метод parseDouble(), в классе Long - parseLong() и так далее. Разница с методом valueOf() состоит в том, что метод valueOf() возвращает объект, а parseXxx() - примитивное значение.
     * Также в целочисленные классы Byte, Short, Integer, Long добавлен метод, в который можно передать строку, содержащую число в любой системе исчисления. Вторым параметром вы указываете саму систему исчисления. Следующий пример показывает использование метода parseLong():
     * @param
     */
    public static void main(String[] args) {
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");
        long long3 = Long.parseLong("101010", 2);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);
    }
}