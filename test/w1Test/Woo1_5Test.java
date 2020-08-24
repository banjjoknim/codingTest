package w1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import w1.Woo1_5;

class Woo1_5Test {

    @ParameterizedTest
    @CsvSource(value = {"13:4", "33:14"}, delimiter = ':')
    public void test(String number, String expected) {
        Woo1_5 woo1_5 = new Woo1_5();
        int correctAnswer = Integer.parseInt(expected);
        int answer = woo1_5.solution(Integer.parseInt(number));
        Assertions.assertEquals(answer, correctAnswer);
    }
}
