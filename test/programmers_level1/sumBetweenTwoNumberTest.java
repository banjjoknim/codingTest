package programmers_level1;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class sumBetweenTwoNumberTest {

    @ParameterizedTest
    @CsvSource(value = {"3 5:12", "3 3:3", "5 3:12"}, delimiter = ':')
    void test(String input, String expectedStr) {
        String[] inputArray = input.split(" ");
        Arrays.sort(inputArray);
        int actual = 0;
        for (int i = Integer.valueOf(inputArray[0]); i <= Integer.valueOf(inputArray[1]); i++) {
            actual += i;
        }
        int expected = Integer.valueOf(expectedStr);
        Assertions.assertEquals(expected, actual);
    }

}
