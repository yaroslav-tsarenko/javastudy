package org.example.leetCode;

public class ReverseBits {
    public static void main(String[] args) {

    }
    public int reverse(int n){
        int x=0;
        int i=31;
        while(i>=0){
            x |= ((n >> i) & 1) << (31 - i);
            i--;
        }
        return x;
    }
}
