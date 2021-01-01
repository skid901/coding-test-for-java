package kr.co.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sort002 {

    private static int compare(String left, String right) {
        return Integer.parseInt(right + left) - Integer.parseInt(left + right);
    }

    public static String solve(int[] numbers) {
        return String.valueOf(
                Integer.parseInt(
                        Arrays.stream(numbers)
                                .mapToObj(Integer::toString)
                                .sorted(Sort002::compare)
                                .collect(Collectors.joining())
                )
        );
    }
}
