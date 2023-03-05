package org.example.algorithms.greedyAlgorithms;

public class GreedyAlgorithmsStation {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};

        //int[] stations = {0, 1000, 2000}

        System.out.println(minStops(stations, 400));
    }

    public static int minStops(int[] stations, int capacity) {

        int result = 0; // optimal stops variables
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }
        return result;
    }
}
