package org.example.leetCode;

public class ReplaceElementsWithGreatestElementOnRight {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
        replaceWithGreatest(arr);

    }

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }

    public static int[] replaceWithGreatest(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}
