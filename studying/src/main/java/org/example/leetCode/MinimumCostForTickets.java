package org.example.leetCode;

public class MinimumCostForTickets {
    public static void main(String[] args) {

    }

    public int minCostTickets(int[] days, int[] costs) {
        return minCostTickets(days, costs, 0, 0, new int[days.length]);
    }

    private int minCostTickets(
            int[] days,
            int[] costs,
            int index,
            int lastPassGoodUntil,
            int dp[]
    ) {
        if (index >= days.length) {
            return 0;
        }
        if (days[index] <= lastPassGoodUntil) {
            minCostTickets(days, costs, index + 1, lastPassGoodUntil, dp);
        }
        if (dp[index] != 0) {
            return dp[index];
        }
        int minCost = Math.min(
                costs[0] + minCostTickets(days, costs, index + 1, days[index], dp),
                Math.min(
                        costs[1] + minCostTickets(days, costs, index + 1, days[index] + 6, dp),
                        costs[2] + minCostTickets(days, costs, index + 1, days[index] + 29, dp)
                )
        );
        dp[index] = minCost;
        return minCost;
    }
}
