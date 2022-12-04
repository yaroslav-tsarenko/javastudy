package org.example.examClouds.Lesson5.OperatorSystemExit;

public class SystemExit {
        public static void main(String[] args) {
            System.out.println("Дo возврата.");
            method(true);
            System.out.println("Этот оператор выполняться не будет.");
        }

        public static void method(boolean flag) {
            if (flag) {
                System.exit(0);
            }
            System.out.println("Этот оператор метода выполняться не будет.");
        }
}
