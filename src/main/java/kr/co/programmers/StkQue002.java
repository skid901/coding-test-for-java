package kr.co.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StkQue002 {

    public static int[] solve(int[] progresses, int[] speeds) {
        int[] completedDays = IntStream.range(0, progresses.length)
                .map(i -> (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]))
                .toArray();

        List<Integer> deployment = new ArrayList<>();
        int version = completedDays[0];
        int count = 0;

        for (int completedDay : completedDays) {
            if (version < completedDay) {
                deployment.add(count);
                version = completedDay;
                count = 0;
            }
            count++;
        }
        deployment.add(count);

        return deployment.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
