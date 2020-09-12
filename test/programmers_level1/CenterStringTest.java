package programmers_level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CenterStringTest {

    @ParameterizedTest
    @CsvSource(value = {"abcde:c", "qwer:we"}, delimiter = ':')
    void solutionTest(String input, String expected) {
        CenterString centerString = new CenterString();
        String actual = centerString.solution(input);
        Assertions.assertEquals(expected, actual);
    }
}
