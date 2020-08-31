package w2Stream;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class Question6Test {

    @ParameterizedTest
    @CsvFileSource(resources = "woo6 - test_case.csv", delimiter = ':')
    public void test(String input, String expected) {

        Question6 question6 = new Question6();
        String[] answer;
        if (expected.length() == 2) {
            answer = new String[] {};
        } else {
            answer = expected.replace("[", "").replace("]", "").replaceAll("\"", "").split(", ");
        }
        String[] form = input.replace("[[", "").replace("]]", "").replaceAll("\"", "")
            .split("], \\[");
        String[][] forms = new String[form.length][];
        IntStream.range(0, forms.length).forEach(index -> forms[index] = form[index].split(", "));
        Assertions.assertArrayEquals(question6.solution(forms), answer);

    }

}
