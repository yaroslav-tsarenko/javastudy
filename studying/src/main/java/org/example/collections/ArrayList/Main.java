package org.example.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("John");
        list.add(person1);
        list.add(person2);
        Iterator<Person> iterator = list.iterator();

        foo(list);
    }

    private static void foo(List<Person> persons){

    }

}
