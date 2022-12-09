package org.example.examClouds.Lesson9.constructor;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("455763576", "Samsung");
        Phone phone2 = new Phone("735763576", "Apple", 7.9);
        Phone phone3 = new Phone("735763576", "Apple", 7.9);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
