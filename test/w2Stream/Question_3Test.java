package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question_3Test {

    @Test
    public void test() {
        int[] prices = {32000, 18000, 42500};
        int[] discounts = {50, 20, 65};
        Question3 question_3 = new Question3();
        int answer = question_3.solution(prices, discounts);
        Assertions.assertEquals(45275, answer);

    }

}
