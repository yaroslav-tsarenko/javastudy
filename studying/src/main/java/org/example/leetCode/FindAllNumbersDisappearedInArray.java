package org.example.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {

        FindAllNumbersDisappearedInArray test = new FindAllNumbersDisappearedInArray();
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        test.findDisappearedNumbers(array);

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> missingNumbers = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i : nums) {
            numbers.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        System.out.println(missingNumbers);
        return missingNumbers;

    }
}
