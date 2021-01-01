package kr.co.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class StkQue003Test {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2, 10, new int[]{7, 4, 5, 6}, 8),
                Arguments.of(100, 100, new int[]{10}, 101),
                Arguments.of(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 110),
                Arguments.of(1, 1, new int[]{1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void solve(int bridgeLength, int weight, int[] truckWeights, int expected) {
        then(StkQue003.solve(bridgeLength, weight, truckWeights)).isEqualTo(expected);
    }
}
