package w2Stream;

import java.text.ParseException;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Woo2_2StreamTest {

    @ParameterizedTest
    @ValueSource(strings = {
        "2019/05/01 00:59:19\n2019/06/01 01:35:20\n2019/08/01 02:01:22\n2019/08/01 02:01:23\n2019/08/02 03:02:35\n2019/10/03 04:05:40\n2019/10/04 06:23:10\n2019/10/10 08:23:20\n2019/10/12 08:42:24\n2019/10/23 08:43:26\n2019/11/14 08:43:29\n2019/11/01 10:19:02\n2019/12/01 11:23:10"})
    public void test(String log) throws ParseException {
        int[] answer = {};
        String expected = "0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 0, 4, 0, 1, 1, 0, 0, 0";
        // String log = "2019/05/01 00:59:19\n2019/06/01 01:35:20\n2019/08/01 02:01:22\n2019/08/01 02:01:23\n2019/08/02 03:02:35\n2019/10/03 04:05:40\n2019/10/04 06:23:10\n2019/10/10 08:23:20\n2019/10/12 08:42:24\n2019/10/23 08:43:26\n2019/11/14 08:43:29\n2019/11/01 10:19:02\n2019/12/01 11:23:10*0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 0, 4, 0, 1, 1, 0, 0, 0";
        Woo2_2Stream woo2_1Stream = new Woo2_2Stream();
        answer = woo2_1Stream.solution(log);
        int[] intArray = Arrays.stream(expected.split(", ")).mapToInt(item -> Integer.parseInt(item)).toArray();
        Assertions.assertArrayEquals(intArray, answer);
    }
}
