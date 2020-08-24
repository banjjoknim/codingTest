package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Woo2_1StreamTest {

    @Test
    public void test() {

        int answer = 0;
        Woo2_1Stream woo2_1Stream = new Woo2_1Stream();
        int[] restaurant = new int[] {0, 0};
        int[][] riders = new int[][] {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500},
            {-1100, 900}};
        int k = 1000;
        answer = woo2_1Stream.solution(restaurant, riders, k);
        Assertions.assertEquals(4, answer);
    }

}
