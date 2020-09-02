package w1Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q2Test {

    @Test
    void test() {
        Q2 q2 = new Q2();
        boolean answer = true;
        int[][] lands = {{10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40}};
        int[][] wells = {{15, 15, 25, 25}, {40, 10, 50, 20}};
        int[] point = {10, 10, 30, 30};
        Assertions.assertEquals(q2.solution(lands, wells, point), answer);
    }
}
