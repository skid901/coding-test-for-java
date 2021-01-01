package kr.co.programmers;

import java.util.Arrays;

public class Sort001 {

    public static int[] solve(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt(command -> {
                    int[] copy = Arrays.copyOfRange(array, command[0] - 1, command[1]);
                    Arrays.sort(copy);
                    return copy[command[2] - 1];
                }).toArray();
    }
}
