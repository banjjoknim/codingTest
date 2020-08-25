package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Woo2_3StreamTest {

    @Test
    public void test() {
        int[] prices = {32000, 18000, 42500};
        int[] discounts = {50, 20, 65};
        Woo2_3Stream woo2_3Stream = new Woo2_3Stream();
        int answer = woo2_3Stream.solution(prices, discounts);
        Assertions.assertEquals(45275, answer);

    }

}
