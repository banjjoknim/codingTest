package programmers_level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberKTest {

    @Test
    void test() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        NumberK numberK = new NumberK();
        int[] answer = {5, 6, 3};
        Assertions.assertArrayEquals(numberK.solution(array, commands), answer);
    }
}
