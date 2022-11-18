package org.example.collections.LinkedList;

import java.util.LinkedList;

public class ExampleOfLinkedList {
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Ukraine");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println(earlBio);

    }
}

class ElementAddInTheMiddleOfList{
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Ukraine");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(1, str2);

        System.out.println(earlBio);

    }

}

class RemoveElementFromList{
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Ukraine");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(1, str2);

        earlBio.remove(1);
        System.out.println(earlBio);
    }
}