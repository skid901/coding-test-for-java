package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class StkQue004Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 2}, 2, 1),
                Arguments.of(new int[]{1, 1, 9, 1, 1, 1}, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] priorities, int location, int expected) {
        then(StkQue004.solve(priorities, location)).isEqualTo(expected);
    }
}
