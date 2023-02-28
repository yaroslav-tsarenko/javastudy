package org.example.leetCode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        maximumWealth(accounts);
    }

    public static void maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank: customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        System.out.println(maxWealthSoFar);
       // return maxWealthSoFar;
    }
}
