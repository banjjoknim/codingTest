import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.sun.istack.internal.Nullable;

class Woo1_7Test {

    @ParameterizedTest
    @Nullable
    @CsvSource(value = {"zyelleyz:", "browoanoommnaon:brown"}, delimiter = ':')
    void test(String cryptogram, String answer) {
        Woo1_7 woo1_7 = new Woo1_7();
        if (answer == null) {
            answer = "";
        }
        String result = woo1_7.solution(cryptogram);
        Assertions.assertEquals(answer, result);
    }

}
