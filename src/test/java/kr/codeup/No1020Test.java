package kr.codeup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

public class No1020Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("Boy", new String[]{"'B'", "'o'", "'y'"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void solve(String received, String[] expected) {
        String[] actual = No1020.solve(received);

        for (int i = 0; i < expected.length; i++) {
            then(actual[i]).isEqualTo(expected[i]);
        }
    }
}
