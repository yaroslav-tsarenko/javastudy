package org.example.string.methods;

public class SplitMethod {
    public static void main(String[] args) {
        String s1 = "Java the best";
        String[] s2;
        s2 = s1.split(" "); /*Вказати розділювач*/
        System.out.println(s1);
        for (String s : s2) {
            System.out.printf("%s\n", s);
        }
    }
}



