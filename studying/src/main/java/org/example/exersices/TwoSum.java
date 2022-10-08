package org.example.exersices;


import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        String line = scanner.nextLine();
        String[] symbols = line.split(",");
        int[] array = new int[symbols.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(symbols[i]);
        }
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int current1 = array[i];
                int current2 = array[j];
                if (current1 + current2 == target){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}



//
//public class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
//        for(int i = 0; i < numbers.length; i++){
//            Integer requiredNum = (Integer)(target - numbers[i]);
//            if(indexMap.containsKey(requiredNum)){
//                int toReturn[] = {indexMap.get(requiredNum), i};
//                return toReturn;
//            }
//
//            indexMap.put(numbers[i], i);
//        }
//        return null;
//    }
//}
