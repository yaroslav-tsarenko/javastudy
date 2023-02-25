package org.example.leetCode;

public class FindPrimeNums {
    public static void main(String[] args) {
        int[] array = new int[100];
        int divisionNum = 2;
        findPrimeNums(array, divisionNum);
    }
    public static void findPrimeNums(int[] array, int divisionNum){
        out_for:
        for (int i = divisionNum; i < array.length; i++) {
            for (int j = divisionNum; j < i; j++) {
                if (i % j == 0){
                continue out_for;
                }
            }
            System.out.println(i);
        }
    }
}
