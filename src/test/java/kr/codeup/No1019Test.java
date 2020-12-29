package kr.codeup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

public class No1019Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("2013.8.5", "2013.08.05"),
                Arguments.of("99.1.1", "0099.01.01")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void solve(String received, String expected) {
        then(No1019.solve(received)).isEqualTo(expected);
    }
}
