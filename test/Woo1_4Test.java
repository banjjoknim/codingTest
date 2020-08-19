import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Woo1_4Test {

    @ParameterizedTest
    @ValueSource(strings = {"097, 98, 197, 198", "1131, 132, 211, 212", "299, 102, 211, 212"})
    public void test(String testCase) {
        int index = Integer.parseInt(testCase.substring(0, 1));
        testCase = testCase.substring(1);
        Woo1_4 woo1_4 = new Woo1_4();
        int[] pobi = new int[2];
        int[] crong = new int[2];
        int[] correctAnswer = new int[] {0, 1, -1};
        pobi[0] = Integer.parseInt(testCase.split(", ")[0]);
        pobi[1] = Integer.parseInt(testCase.split(", ")[1]);
        crong[0] = Integer.parseInt(testCase.split(", ")[2]);
        crong[1] = Integer.parseInt(testCase.split(", ")[3]);
        int answer = woo1_4.solution(pobi, crong);
        Assertions.assertEquals(correctAnswer[index], answer);

    }
}
