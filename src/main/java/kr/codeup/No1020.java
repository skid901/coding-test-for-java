package kr.codeup;

import java.util.Arrays;

public class No1020 {

    public static String[] solve(String received) {
        return Arrays.stream(received.split(""))
                .map(token -> String.format("'%s'", token))
                .toArray(String[]::new);
    }
}
