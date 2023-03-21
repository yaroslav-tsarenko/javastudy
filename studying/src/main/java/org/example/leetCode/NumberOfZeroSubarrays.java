package org.example.leetCode;

public class NumberOfZeroSubarrays {
    public static void main(String[] args) {

    }

    public long zeroFilledSubarray(int[] nums) {
        long total = 0L;
        long count = 0L;
        for (int i : nums) {
            if (i == 0){
                count++;
            }else if(count > 0){
                total += count * (count + 1L) >> 1;
                count = 0;
            }
        }
        if (count > 0){
            total += count * (count + 1L) >> 1;
        }
        return total;
    }
}
