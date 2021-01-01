package kr.co.programmers;

import java.util.Arrays;

public class Sort003 {

    public static int solve(int[] citations) {
        int hIndex = 0;

        for (int i = 1; i <= citations.length; i++) {
            int finalI = i;
            int count = (int) Arrays.stream(citations)
                    .filter(citation -> citation >= finalI)
                    .count();
            if (count >= finalI) {
                hIndex = finalI;
            }
        }

        return hIndex;
    }
}
