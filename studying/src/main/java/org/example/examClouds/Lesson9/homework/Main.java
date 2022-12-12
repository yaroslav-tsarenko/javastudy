package org.example.examClouds.Lesson9.homework;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone message = new Phone();

        phone1.setNumber(57439495);
        phone1.setModel("Xiaomi");
        phone1.setWeight(500);

        phone2.setNumber(36654646);
        phone2.setModel("Samsung");
        phone2.setWeight(600);

        phone3.setNumber(395354554);
        phone3.setModel("Apple");
        phone3.setWeight(700);

        System.out.print(phone1.getNumber() + " ");
        System.out.print(phone1.getModel() + " ");
        System.out.print(phone1.getWeight() + " ");
        System.out.println();

        System.out.print(phone2.getNumber() + " ");
        System.out.print(phone2.getModel() + " ");
        System.out.print(phone2.getWeight() + " ");
        System.out.println();

        System.out.print(phone3.getNumber() + " ");
        System.out.print(phone3.getModel() + " ");
        System.out.print(phone3.getWeight() + " ");
        System.out.println();

         phone1.receiveCall("Oleg ", "343443 ");
         phone2.receiveCall("Marina ", "4343434 ");
         phone3.receiveCall("Karina ", "48845854845 ");

         message.sendMessage(45665656, 344545454, 54545454);
    }
}
