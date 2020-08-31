package w1Stream;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Q1Test {

    @ParameterizedTest
    @CsvSource(value = {"50237:1,0,0,0,0,2,0,3,7", "15000:0,1,1,0,0,0,0,0,0"}, delimiter = ':')
    void test(String input, String expected) {
        Q1 q1 = new Q1();
        int money = Integer.parseInt(input);
        int[] answer = Arrays.stream(expected.split(",")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(answer).forEach(System.out::print);
        Assertions.assertArrayEquals(q1.solution(money), answer);
    }

}
