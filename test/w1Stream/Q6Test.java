package w1Stream;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q6Test {

    @Test
    void test() throws ParseException {
        Q6 q6 = new Q6();
        String[] logs = {"woni request 09:12:29", "brown request 09:23:11", "brown leave 09:23:44",
                "jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02"};
        String[] answer = {"jason", "woni"};
        Assertions.assertArrayEquals(q6.solution(logs), answer);
    }

}
