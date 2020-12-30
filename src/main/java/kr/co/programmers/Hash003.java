package kr.co.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash003 {

    public static int solve(String[][] clothes) {
        /*
        // "java collect groupingby" 키워드로 검색
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                // .collect(groupingBy(p -> p[1], counting()))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1))
                .intValue() - 1;
         */

        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(clothes).forEach(cloth -> {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 1) + 1);
        });

        return -1 + map.values().stream()
                .reduce(1, (acc, cur) -> acc * cur);
    }
}
