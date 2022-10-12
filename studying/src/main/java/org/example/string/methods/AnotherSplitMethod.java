package org.example.string.methods;

public class AnotherSplitMethod {
    public static void main(String[] args) {
        String str1 = new String("Hot Java");
        String str2 = "Java";
        String[] strings = str1.split(" ");
        for (String element : strings) {
            System.out.println(element);
            /*Print: Hot(Розділяє рядки, вказати розділювач) Java*/
        }
    }
}

