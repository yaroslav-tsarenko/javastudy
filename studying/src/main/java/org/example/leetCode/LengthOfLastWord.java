package org.example.leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String string = "Hello world";
        String string2 = "   fly     in the          moon";
        System.out.println(lengthOfLastWord(string));
        System.out.println(lengthOfLastWord(string2));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
