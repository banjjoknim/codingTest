import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Woo1_1Test {

    @ParameterizedTest
    @CsvSource(value = {"50237:[1, 0, 0, 0, 0, 2, 0, 3, 7]", "15000:[0, 1, 1, 0, 0, 0, 0, 0, 0]"}, delimiter = ':')
    public void test(String money, String expectedStr) {
        Woo1_1 woo1_1 = new Woo1_1();
        String[] expectedStrArray = expectedStr.replace("[", "").replace("]", "").split(", ");
        int[] expected = new int[expectedStrArray.length];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = Integer.parseInt(expectedStrArray[i]);
        }
        int[] answer = woo1_1.solution(Integer.parseInt(money));
        Assertions.assertArrayEquals(expected, answer);
    }
}
