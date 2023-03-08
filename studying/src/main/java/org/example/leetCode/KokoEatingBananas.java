package org.example.leetCode;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        int min = 0;
        while (min < max) {
            int mid = min + (max - min) / 2;
            double k = 0;
            for (int pile : piles) {
                k += Math.ceil((double) pile / mid);
            }
            if (k > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
