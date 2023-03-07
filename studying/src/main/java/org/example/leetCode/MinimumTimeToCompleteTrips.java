package org.example.leetCode;

public class MinimumTimeToCompleteTrips {
    int[] times = {1, 2, 3};
    int trips = 5;

    public static long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long min = time[0];
        for (int t : time) {
            min = Math.min(min, t);
        }
        long right = totalTrips * min;

        while (left < right) {
            long mid = (right - left) / 2 + left;
            long total = totalTripInGiven(time, mid);

            if (total < totalTrips) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;

    }

    private static long totalTripInGiven(int[] time, long givenTime) {
        long totalTrips = 0l;
        for (int tripTime : time) {
            totalTrips += ((long) givenTime) / tripTime;
        }
        return totalTrips;
    }
}
