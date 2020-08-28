package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question_1Test {

    @Test
    public void test() {

        int answer = 0;
        Question1 question_1 = new Question1();
        int[] restaurant = new int[] {0, 0};
        int[][] riders = new int[][] {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500},
            {-1100, 900}};
        int k = 1000;
        answer = question_1.solution(restaurant, riders, k);
        Assertions.assertEquals(4, answer);
    }

}
