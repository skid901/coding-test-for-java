package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class StkQue001Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 2, 3}, new int[]{4, 3, 1, 1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] prices, int[] expected) {
        then(StkQue001.solve(prices)).isEqualTo(expected);
    }
}
