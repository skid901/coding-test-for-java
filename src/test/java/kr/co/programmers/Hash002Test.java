package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Hash002Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[]{"119", "97674223", "1195524421"}, false),
                Arguments.of(new String[]{"123", "456", "789"}, true),
                Arguments.of(new String[]{"12", "123", "1235", "567", "88"}, false),
                Arguments.of(new String[]{"012"}, true),
                Arguments.of(new String[]{"1234", "12"}, false),
                Arguments.of(new String[]{"0", "1"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(String[] phoneBook, boolean expected) {
        then(Hash002.solve(phoneBook)).isEqualTo(expected);
    }
}
