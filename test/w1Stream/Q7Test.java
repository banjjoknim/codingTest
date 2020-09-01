package w1Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Q7Test {

    @ParameterizedTest
    @CsvSource(value = {"zyelleyz:", "browoanoommnaon:brown"}, delimiter = ':')
    void test(String cryptogram, String answer) {
        Q7 q7 = new Q7();
        if (answer == null) {
            answer = "";
        }
        Assertions.assertEquals(q7.solution(cryptogram), answer);
    }
}
