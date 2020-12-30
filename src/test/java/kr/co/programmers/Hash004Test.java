package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Hash004Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(
                        new String[]{"classic", "pop", "classic", "classic", "pop"},
                        new int[]{500, 600, 150, 800, 2500},
                        new int[]{4, 1, 3, 0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(String[] genres, int[] plays, int[] expected) {
        then(Hash004.solve(genres, plays)).isEqualTo(expected);
    }
}
