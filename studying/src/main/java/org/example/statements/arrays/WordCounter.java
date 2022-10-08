package org.example.statements.arrays;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words in one line with spaces: ");
        String input = sc.nextLine();
        //Початкова кількість слів 0
        int count = 0;
        //Рахуємо слова, іначе кінець програмі
        if(input.length() != 0){
            count++;
            //Провіряємо чи не пробіл кожен символ
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Якщо пробіл - збільшуємо на 1
                    count++;
                }
            }
        }
        System.out.println("You have been entered "+ count + " words");
    }
}
