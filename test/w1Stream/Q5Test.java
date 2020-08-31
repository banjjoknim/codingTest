package w1Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q5Test {

    @Test
    void test() {
        int number = 40;
        int answer = 4;
        Q5 q5 = new Q5();
        Assertions.assertEquals(q5.solution(number), answer);
    }

}
