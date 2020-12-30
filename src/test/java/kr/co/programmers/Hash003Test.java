package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class Hash003Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new String[][]{
                        new String[] {"yellow_hat", "headgear"},
                        new String[] {"blue_sunglasses", "eyewear"},
                        new String[] {"green_turban", "headgear"}
                }, 5),
                Arguments.of(new String[][]{
                        new String[] {"crow_mask", "face"},
                        new String[] {"blue_sunglasses", "face"},
                        new String[] {"smoky_makeup", "face"}
                }, 3),
                Arguments.of(new String[][]{
                        new String[] {"a", "type_a"}
                }, 1),
                Arguments.of(new String[][]{
                        new String[] {"a", "type_a"},
                        new String[] {"aa", "type_a"}
                }, 2),
                Arguments.of(new String[][]{
                        new String[] {"a", "type_a"},
                        new String[] {"b", "type_b"}
                }, 3),
                Arguments.of(new String[][]{
                        new String[] {"a", "type_a"},
                        new String[] {"aa", "type_a"},
                        new String[] {"b", "type_b"}
                }, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(String[][] clothes, int expected) {
        then(Hash003.solve(clothes)).isEqualTo(expected);
    }
}
