package org.example.leetCode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class isPalindrome2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "A mandgd, a plantrt, a canalarer: Panamgfga";
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome2(s2));


    }


    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] words = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        builder.append(words);
        builder.reverse();
        System.out.println(builder);
        if (s.contentEquals(builder)) {
            return true;
        } else {
            return false;
        }
    }


    public static void isPalindrome(String s) {
        List<String> resultList = Stream.of(s.split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}


/*int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }*/