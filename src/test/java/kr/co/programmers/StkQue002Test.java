package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class StkQue002Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{93, 30, 55}, new int[]{1, 30, 5}, new int[]{2, 1}),
                Arguments.of(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}, new int[]{1, 3, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] progresses, int[] speeds, int[] expected) {
        then(StkQue002.solve(progresses, speeds)).isEqualTo(expected);
    }
}
