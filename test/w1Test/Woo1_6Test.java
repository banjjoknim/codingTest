package w1Test;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import w1.Woo1_6;

class Woo1_6Test {

    @ParameterizedTest
    @CsvSource(value = {
            "woni request 09:12:29, brown request 09:23:11, brown leave 09:23:44, jason request 09:33:51, jun request 09:33:56, cu request 09:34:02*jason, woni"}, delimiter = '*')
    void test(String input, String expected) throws ParseException {
        Woo1_6 woo1_6 = new Woo1_6();
        int totalTicket = 2000;
        String[] logs = input.split(", ");
        String[] answer = woo1_6.solution(totalTicket, logs);
        String[] correctAnswer = expected.split(", ");
        Assertions.assertArrayEquals(correctAnswer, answer);
    }
}
