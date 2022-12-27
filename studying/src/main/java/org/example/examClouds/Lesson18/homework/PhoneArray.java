package org.example.examClouds.Lesson18.homework;

import org.example.examClouds.Lesson9.constructor.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneArray {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone("067111", "IPhone", 45));
        phones.add(new Phone("0671365", "nokia", 42));
        phones.add(new Phone("0673411", "Samsung", 41));

        System.out.println(phones);

        for (Phone phone: phones){
            System.out.println(phone.getNumber());
        }
    }
}
