package org.example.exersices.Slack.AnotherExercise;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Enter text: ");
        String words = text.nextLine();
        System.out.println("Enter symbols to search: ");
        String symbol = text.next();
        String[] symbols = words.split("");
        String[] searchedSymbols = symbol.split(",");
        int[] counters = new int[searchedSymbols.length];
        for (String currentSymbol : symbols) {
            for (int i = 0, searchedSymbolsLength = searchedSymbols.length; i < searchedSymbolsLength; i++) {
                String searchedSymbol = searchedSymbols[i];
                if (currentSymbol.equals(searchedSymbol)) {
                    counters[i]=counters[i]+1;
                }
            }
        }
        for (int i = 0; i < counters.length; i++) {
            int counter = counters[i];
            System.out.println(searchedSymbols[i]+ " = " +counter);
        }
    }
}
