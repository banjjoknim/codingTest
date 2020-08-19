import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Woo1_1Test {

    @ParameterizedTest
    @ValueSource(strings = {"050237", "115000"})
    public void test(String moneyStr) {
        Woo1_1 woo1_1 = new Woo1_1();
        int index = Integer.parseInt(moneyStr.substring(0, 1));
        int money = Integer.parseInt(moneyStr.substring(1));
        int[] answer = woo1_1.solution(money);
        int[][] correctAnswer = {{1, 0, 0, 0, 0, 2, 0, 3, 7}, {0, 1, 1, 0, 0, 0, 0, 0, 0}};
        Assertions.assertArrayEquals(correctAnswer[index], answer);
    }
}
