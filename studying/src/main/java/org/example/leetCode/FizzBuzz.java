package org.example.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 300;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(n);

    }

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currString = "";

           if(divisibleBy3){
               currString += "Fizz";
           }

           if (divisibleBy5){
               currString += "Buzz";
           }

           if (currString.isEmpty()){
               currString += String.valueOf(i);
           }
           answer.add(currString);

        }
        System.out.println(answer);
        return answer;
    }
}
