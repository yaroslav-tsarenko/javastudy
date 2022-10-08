package org.example.statements.arrays;

public class WordReverser {
    public static void main(String[] args){

        String[] a = { "I ","wanna "," travel ","around ","the ","world "};
        //Виводимо початковий масив у консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        //Значення яке буде використовуватись при обміні елементів
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        //Виводимо масив який вийшов
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
