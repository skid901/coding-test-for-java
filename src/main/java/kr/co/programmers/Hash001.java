package kr.co.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash001 {

    public static String solve(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(participant).forEach(key -> {
            int count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
        });
        Arrays.stream(completion).forEach(key -> map.put(key, map.get(key) - 1));

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}
