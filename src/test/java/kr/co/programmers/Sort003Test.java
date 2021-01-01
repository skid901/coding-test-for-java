package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Sort003Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{2}, 1),
                Arguments.of(new int[]{0, 1}, 1),
                Arguments.of(new int[]{1, 2}, 1),
                Arguments.of(new int[]{2, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] citations, int expected) {
        then(Sort003.solve(citations)).isEqualTo(expected);
    }
}
