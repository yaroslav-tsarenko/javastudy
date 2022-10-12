package org.example.string.methods;

public class ColumnMethod {
        public static void main(String[] args) {
        String str1 = new String("Hot Java Hello");
        char [] charArray = str1.toCharArray();
        for (char element: charArray){
            System.out.println(element);
          /*  (Виводить всі символи у стовпчик)*/
        }
    }
 }

