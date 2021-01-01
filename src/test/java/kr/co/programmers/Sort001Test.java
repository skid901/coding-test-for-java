package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Sort001Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{
                        new int[]{2, 5, 3},
                        new int[]{4, 4, 1},
                        new int[]{1, 7, 3}
                }, new int[]{5, 6, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int[] array, int[][] commands, int[] expected) {
        then(Sort001.solve(array, commands)).isEqualTo(expected);
    }
}
