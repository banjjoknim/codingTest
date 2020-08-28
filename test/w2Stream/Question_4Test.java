package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question_4Test {

    @Test
    public void test() {
        Question4 question_4 = new Question4();
        String[] infos = {"kim password", "lee abc"};
        String[] actions = {
            "ADD 30",
            "LOGIN kim abc",
            "LOGIN lee password",
            "LOGIN kim password",
            "LOGIN kim password",
            "ADD 30",
            "ORDER",
            "ORDER",
            "ADD 40",
            "ADD 50"
        };
        boolean[] answer = new boolean[] {false, false, false, true, false, true, true, false, true, true};
        Assertions.assertArrayEquals(answer, question_4.solution(infos, actions));

    }

}
