package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Sort002Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{6, 10, 2}, "6210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330"),
                Arguments.of(new int[]{0, 0}, "0"),
                Arguments.of(new int[]{0, 0, 0}, "0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] numbers, String expected) {
        then(Sort002.solve(numbers)).isEqualTo(expected);
    }
}
