package w1Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q4Test {

    @Test
    void test() {
        Q4 q4 = new Q4();
        int[] pobi = {399, 400};
        int[] crong = {211, 212};
        Assertions.assertEquals(q4.solution(pobi, crong), 1);
    }

}
