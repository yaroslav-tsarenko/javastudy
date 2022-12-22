package org.example.examClouds.Lesson13.homework;

import java.util.regex.Pattern;

public class isPalindromeDemo {

    private static final String WORD_DELIMITER = " ";

    public static String[] findPalindromes(String input, Pattern findPattern, String... excludedSymbols) {
        String[] words = splitLineToWords(input, excludedSymbols);
        StringBuilder palindromes = new StringBuilder();

        for (String word : words) {
            boolean palindrome = isPalindrome(word, findPattern);
            if (palindrome){
                palindromes.append(word);
                palindromes.append(WORD_DELIMITER);
            }
        }

        return palindromes.toString().split(WORD_DELIMITER);

    }

    private static boolean isPalindrome(String word, Pattern findPattern) {
        boolean isNumberWord = findPattern.matcher(word).matches();
        boolean isPalindrome = false;
        if (isNumberWord) {
            isPalindrome = new StringBuilder(word).reverse().toString().equals(word);
        }
        return isPalindrome;
    }

    private static String[] splitLineToWords(String input, String... excludedSymbols) {
        String[] words = input.split(WORD_DELIMITER);
        String[] trimmedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            trimmedWords[i] = trim(word, excludedSymbols);
        }
        return trimmedWords;
    }

    private static String trim(String checkedWord, String[] excludedSymbols) {
        String[] symbols = checkedWord.split("");
        StringBuilder wordBuilder = new StringBuilder();
        for (String symbol : symbols) {
            for (String excludedSymbol : excludedSymbols) {
                if (!symbol.equals(excludedSymbol)) {
                    wordBuilder.append(symbol);
                    break;
                }
            }
        }
        return wordBuilder.toString();
    }
}