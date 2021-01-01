package kr.co.programmers;

import java.util.Arrays;

public class StkQue003 {

    private static class Bridge {

        private final int[] queue;
        private final int weight;
        private int passed = 0;

        public Bridge(int bridgeLength, int weight) {
            this.queue = new int[bridgeLength];
            this.weight = weight;
        }

        public void move() {
            if (queue[0] != 0) {
                passed++;
            }
            for (int i = 0; i < queue.length - 1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[queue.length - 1] = 0;
        }

        public boolean canEnter(int truckWeight) {
            return Arrays.stream(queue)
                    .sum() + truckWeight <= weight;
        }

        public void enter(int truckWeight) {
            queue[queue.length - 1] = truckWeight;
        }

        public int getPassed() {
            return this.passed;
        }
    }

    public static int solve(int bridgeLength, int weight, int[] truckWeights) {
        Bridge bridge = new Bridge(bridgeLength, weight);
        int index = 0;
        int seconds = 0;

        while (bridge.getPassed() < truckWeights.length) {
            bridge.move();
            if (index < truckWeights.length && bridge.canEnter(truckWeights[index])) {
                bridge.enter(truckWeights[index]);
                index++;
            }
            seconds++;
        }

        return seconds;
    }
}
