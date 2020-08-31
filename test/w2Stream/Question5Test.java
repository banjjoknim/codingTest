package w2Stream;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class Question5Test {

    @ParameterizedTest
    @CsvFileSource(resources = "woo5 - text_case.csv", delimiter = ':')
    public void test(String input, String expected) {
        String[] history = input.replaceAll("\\\"", "")
            .replace("[", "")
            .replace("]", " ")
            .replaceAll(" ", "")
            .split(",");
        int[] answer = Arrays.stream(expected.replace("[", "").replace("]", "").split(", "))
            .mapToInt((item -> Integer.parseInt(item))).toArray();

        Question5 question5 = new Question5();
        Assertions.assertArrayEquals(question5.solution(history), answer);
    }
}
