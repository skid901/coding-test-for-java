package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Hash001Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}, "leo"),
                Arguments.of(
                        new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                        new String[]{"josipa", "filipa", "marina", "nikola"},
                        "vinko"
                ),
                Arguments.of(
                        new String[]{"mislav", "stanko", "mislav", "ana"},
                        new String[]{"stanko", "ana", "mislav"},
                        "mislav"
                ),
                Arguments.of(new String[]{"a"}, new String[]{}, "a"),
                Arguments.of(new String[]{"a", "a"}, new String[]{"a"}, "a"),
                Arguments.of(new String[]{"a", "a", "b"}, new String[]{"a", "a"}, "b")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(String[] participant, String[] completion, String expected) {
        then(Hash001.solve(participant, completion)).isEqualTo(expected);
    }
}
