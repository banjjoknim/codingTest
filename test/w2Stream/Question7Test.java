package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question7Test {

    @Test
    public void test() {
        Question7 question7 = new Question7();
        String[] answer = {"andole", "jun", "bedi"};
        String user = "mrko";
        String[][] friends = {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"},
                {"shakevan", "jun"},
                {"shakevan", "mrko"}};
        String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan"};
        Assertions.assertArrayEquals(question7.solution(user, friends, visitors), answer);

    }
}
