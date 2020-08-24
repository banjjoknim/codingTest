package w1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import w1.Woo1_4;

class Woo1_4Test {

    @ParameterizedTest
    @CsvSource(value = {"97, 98, 197, 198:0", "131, 132, 211, 212:1", "99, 102, 211, 212:-1"}, delimiter = ':')
    public void test(String testCase, String expected) {
        Woo1_4 woo1_4 = new Woo1_4();
        int expectedAnswer = Integer.parseInt(expected);
        int[] pobi = new int[2];
        int[] crong = new int[2];
        pobi[0] = Integer.parseInt(testCase.split(", ")[0]);
        pobi[1] = Integer.parseInt(testCase.split(", ")[1]);
        crong[0] = Integer.parseInt(testCase.split(", ")[2]);
        crong[1] = Integer.parseInt(testCase.split(", ")[3]);
        int answer = woo1_4.solution(pobi, crong);
        Assertions.assertEquals(expectedAnswer, answer);

    }
}
